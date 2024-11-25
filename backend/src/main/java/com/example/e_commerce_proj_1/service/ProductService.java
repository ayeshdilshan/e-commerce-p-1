package com.example.e_commerce_proj_1.service;

import com.example.e_commerce_proj_1.dto.CommonResponse;
import com.example.e_commerce_proj_1.model.Product;
import com.example.e_commerce_proj_1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }

    public ResponseEntity<CommonResponse> addProduct(Product product, MultipartFile imageFile) {
        CommonResponse commonResponse = new CommonResponse();
        try {
            product.setImageName(imageFile.getOriginalFilename());
            product.setImageType(imageFile.getContentType());
            product.setImageData(imageFile.getBytes());
            productRepository.save(product);

            commonResponse.setStatus(HttpStatus.CREATED);
            commonResponse.setMessage("product saved successfully");
            commonResponse.setData(null);
        } catch (Exception e) {
            commonResponse.setData(null);
            commonResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            commonResponse.setMessage("product saved failed");
        }
        return ResponseEntity.ok().body(commonResponse);
    }
}
