package com.example.springframeworke122.controller;

import com.example.springframeworke122.model.Product;
import com.example.springframeworke122.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/all")
    public Iterable<Product> findall(){

        return productRepository.findAll();
    }

    @GetMapping("/name/{name}")
    public List<Product> findAll(@PathVariable String name) {
        return productRepository.findProductByName(name);
    }

}
