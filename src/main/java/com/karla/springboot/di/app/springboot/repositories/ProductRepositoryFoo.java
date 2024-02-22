package com.karla.springboot.di.app.springboot.repositories;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.karla.springboot.di.app.springboot.models.Product;
@Primary
@Repository
public class ProductRepositoryFoo implements ProductRepository  {

    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        return Collections.singletonList(new Product(1L, "Monitor Azus", 600L));
    }

    @Override
    public Product findById(Long id) {
        // TODO Auto-generated method stub
        return new Product(1L, "Monitor Azus", 600L);
    }

}
