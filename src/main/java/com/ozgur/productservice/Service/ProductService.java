package com.ozgur.productservice.Service;

import com.ozgur.productservice.Entity.Product;

import java.util.List;
import java.util.Optional;
import java.util.function.LongFunction;

public interface ProductService {
    List<Product> allProducts();
    List<Product> findProductByName(String name);
    List<Product> findProductsByBrand(String brand);
    Optional<Product> findProductByProductNo(Long productNo);
    List<Product> findProductsByPrice(double min,double max);
    Product getDetailByProductNo(Long productNo);
    Product updateProduct(Product product);
    void softDeleteProduct(Long productNo);
    Product createProduct(Product product);
}
