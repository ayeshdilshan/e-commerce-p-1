package com.example.e_commerce_proj_1.service.Impl;

import com.example.e_commerce_proj_1.dto.CommonResponse;
import com.example.e_commerce_proj_1.model.Category;
import com.example.e_commerce_proj_1.repository.CategoryRepository;
import com.example.e_commerce_proj_1.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ResponseEntity<CommonResponse> saveCategory(Category category) {
        CommonResponse response = new CommonResponse();

        try {
            Category savedCategory = categoryRepository.save(category);
            response.setStatus(HttpStatus.CREATED);
            response.setMessage("category saved successfully");
            response.setData(savedCategory);
        } catch (Exception e) {
            response.setData(null);
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            response.setMessage("category saved failed");
        }
        return ResponseEntity.ok().body(response);
    }
}
