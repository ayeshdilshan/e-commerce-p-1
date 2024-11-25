package com.example.e_commerce_proj_1.service;

import com.example.e_commerce_proj_1.dto.CommonResponse;
import org.springframework.http.ResponseEntity;

public interface productService {

    ResponseEntity<CommonResponse> createReceipt();
}
