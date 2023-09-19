package com.ozgur.productservice.Controller;

import com.ozgur.productservice.Entity.Product;
import com.ozgur.productservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return productService.allProducts();
    }

    @PostMapping("/product/add")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping("/find/price")
    public List<Product> findProductsByPrice(@RequestParam Double minValue,@RequestParam Double maxValue){
        return productService.findProductsByPrice(minValue,maxValue);
    }

    @GetMapping("/find/brand")
    public List<Product> findProductsByBrand(@RequestParam String brand){
        return  productService.findProductsByBrand(brand);
    }

    @GetMapping("/find/productNo")
    public Optional<Product> findProductByProductNo(@RequestParam Long productNo){
        return productService.findProductByProductNo(productNo);
    }

    @GetMapping("/find/name")
    public List<Product> findProductByName(@RequestParam String name){
        return productService.findProductByName(name);
    }

    @PutMapping("/product/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/product/delete/{id}")
    public void softDeleteProduct(@PathVariable("id") Long id){
        productService.softDeleteProduct(id);
    }



}
