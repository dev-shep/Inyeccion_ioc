
package com.karla.springboot.di.app.springboot.repositories;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.karla.springboot.di.app.springboot.models.Product;
@Repository
public class ProductRepositoryImpl implements ProductRepository{

    private List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
            new Product(1L, "Memoria corsair 32", 300L),
            new Product(2L, "CPU Intel Core i9", 850L),
            new Product(3L, "Audifonos Xiaomi", 900L),
            new Product(4L, "Iphone 19", 15000L)
        );
    }
    @Override
    public List<Product> findAll(){
        return data;
    }
    
    @Override
    public Product findById(Long id){
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();

    }
}
