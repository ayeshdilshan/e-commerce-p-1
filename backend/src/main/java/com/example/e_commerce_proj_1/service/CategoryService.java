package com.example.e_commerce_proj_1.service;

import com.example.e_commerce_proj_1.dto.CommonResponse;
import com.example.e_commerce_proj_1.dto.category.CategorySaveDTO;
import com.example.e_commerce_proj_1.model.Category;
import org.springframework.http.ResponseEntity;

public interface CategoryService {

    ResponseEntity<CommonResponse> saveCategory(Category category);

}
