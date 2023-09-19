package com.ozgur.productservice.Service.impl;

import com.ozgur.productservice.Entity.Product;
import com.ozgur.productservice.Repository.ProductRepository;
import com.ozgur.productservice.Service.ProductService;
import jakarta.persistence.PreRemove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.exact;

@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepository productRepository;



    @Override
    public List<Product> allProducts() {
        Product probe = new Product();
        probe.setIsVisible(1);
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("isVisible",exact());
        Example<Product> example = Example.of(probe,exampleMatcher);
        return productRepository.findAll(example);
    }

    @Override
    public List<Product> findProductByName(String name) {
        Product probe = new Product();
        probe.setIsVisible(1);
        probe.setName(name);
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("name",exact());
        Example<Product> example = Example.of(probe,exampleMatcher);
        return productRepository.findAll(example);
    }

    @Override
    public List<Product> findProductsByBrand(String brand) {
        Product probe = new Product();
        probe.setBrand(brand);
        probe.setIsVisible(1);
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("brand",exact());
        Example<Product> example = Example.of(probe,exampleMatcher);
        return productRepository.findAll(example);
    }

    @Override
    public Optional<Product> findProductByProductNo(Long productNo) {
        return productRepository.findById(productNo);
    }

    @Override
    public List<Product> findProductsByPrice(double min, double max) {
        return productRepository.findByPriceBetweenAndIsVisibleEquals(min,max,1);
    }

    @Override
    public Product getDetailByProductNo(Long productNo) {
        return productRepository.findByProductNo(productNo);
    }

    @Override
    public Product updateProduct(Product product) {
        Product p =  productRepository.findByProductNo(product.getProductNo());
        if(product.getBrand() == null){
            product.setBrand(p.getBrand());
        }
        if(product.getName() == null){
            product.setName(p.getName());
        }
        if(product.getDescription() == null){
            product.setDescription(p.getDescription());
        }
        if(product.getCurrency() == null){
            product.setCurrency(p.getCurrency());
        }
        if(product.getPrice() == null){
            product.setPrice(p.getPrice());
        }
        return productRepository.save(product);
    }

    @Override
    public void softDeleteProduct(Long productNo) {
        Product p = productRepository.findByProductNo(productNo);
        p.setIsVisible(0);
        updateProduct(p);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
