package com.ozgur.productservice.Repository;

import com.ozgur.productservice.Entity.Product;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product> findByPriceBetweenAndIsVisibleEquals(Double minValue, Double maxValue,int bool);
    public Product findByProductNo(Long productNo);
}
