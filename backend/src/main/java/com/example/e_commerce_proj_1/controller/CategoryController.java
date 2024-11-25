package com.example.e_commerce_proj_1.controller;

import com.example.e_commerce_proj_1.dto.CommonResponse;
import com.example.e_commerce_proj_1.model.Category;
import com.example.e_commerce_proj_1.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping(value = "/add")
    public ResponseEntity<CommonResponse> addNewCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);

    }
}
