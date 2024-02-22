package com.karla.springboot.di.app.springboot.repositories;
import com.karla.springboot.di.app.springboot.models.Product;
import java.util.List;

public interface ProductRepository {

    List<Product> findAll();
    
    Product findById(Long id);
}
