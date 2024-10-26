package com.example.e_commerce_proj_1.service;

import com.example.e_commerce_proj_1.model.Product;
import com.example.e_commerce_proj_1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
