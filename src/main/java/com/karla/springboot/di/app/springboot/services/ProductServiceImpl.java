package com.karla.springboot.di.app.springboot.services;

import com.karla.springboot.di.app.springboot.models.Product;
import com.karla.springboot.di.app.springboot.repositories.ProductRepositoryImpl;

import jakarta.websocket.server.ServerEndpoint;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepositoryImpl repository ;

    @Override
    public List<Product> findAll(){

        return repository.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * 1.25d;
            //Product newProd = new Product(p.getId(),p.getName(),priceImp.longValue());
            Product newProd = (Product) p.clone();
            newProd.setPrice(priceTax.longValue()); 
            return newProd;
        }).collect(Collectors.toList());
        
    }

    @Override
    public Product findById(Long id){
        return repository.findById(id);
    }
}
