package com.karla.springboot.di.app.springboot.services;

import java.util.List;

import com.karla.springboot.di.app.springboot.models.Product;

public interface ProductService {

    List<Product> findAll();
    
    Product findById(Long id);
}
