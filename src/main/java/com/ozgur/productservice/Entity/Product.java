package com.ozgur.productservice.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product-no")
    private Long productNo;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name = "brand")
    private String brand;
    @Column(name="currency")
    private String currency;
    @Column(name ="price")
    private Double price;
    @Column(name = "stock-quantity")
    private int stockQuantity;
    @Column(name = "isVisible")
    private int isVisible;

    public Product() {
    }

    public Product(String name, String description, String brand, String currency, Double price, int stockQuantity, int isVisible) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.currency = currency;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.isVisible = isVisible;
    }

    public Long getProductNo() {
        return productNo;
    }

    public void setProductNo(Long productNo) {
        this.productNo = productNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(int isVisible) {
        this.isVisible = isVisible;
    }
}
