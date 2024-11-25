package com.example.e_commerce_proj_1.controller;

import com.example.e_commerce_proj_1.dto.CommonResponse;
import com.example.e_commerce_proj_1.model.Product;
import com.example.e_commerce_proj_1.service.Impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productServiceImpl;

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return productServiceImpl.getAllProducts();
    }

    @GetMapping("/getProductById/{id}")
    public Optional<Product> getProduct(@PathVariable int id) {
        return productServiceImpl.getProductById(id);
    }

    @PostMapping(value = "/add", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<CommonResponse> addProduct(@RequestPart("product") Product product, @RequestPart("imageData") MultipartFile imageFile) {
        return productServiceImpl.addProduct(product, imageFile);

    }
}
