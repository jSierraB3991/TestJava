package com.example.okab.spring.test.docker.maven.infrastructure.controller;

import com.example.okab.spring.test.docker.maven.domain.dto.CategoryCreate;
import com.example.okab.spring.test.docker.maven.domain.dto.CategoryResponse;
import com.example.okab.spring.test.docker.maven.domain.mapper.CategoryMapper;
import com.example.okab.spring.test.docker.maven.domain.model.Category;
import com.example.okab.spring.test.docker.maven.domain.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
public class CategoryController extends GenericController<CategoryResponse, Category, CategoryCreate> {

    @Autowired
    public CategoryController(CategoryService service,
                              CategoryMapper mapper) {
        super(service, mapper);
    }
}
