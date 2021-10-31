package com.example.okab.spring.test.docker.maven.domain.service.impl;

import com.example.okab.spring.test.docker.maven.domain.dto.CategoryCreate;
import com.example.okab.spring.test.docker.maven.domain.dto.CategoryResponse;
import com.example.okab.spring.test.docker.maven.domain.mapper.CategoryMapper;
import com.example.okab.spring.test.docker.maven.domain.model.Category;
import com.example.okab.spring.test.docker.maven.domain.service.CategoryService;
import com.example.okab.spring.test.docker.maven.infrastructure.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends GenericServiceImpl<Category, CategoryCreate, CategoryResponse> implements CategoryService {

    @Autowired
    public CategoryServiceImpl(CategoryRepository repository,
                               CategoryMapper mapper) {
        super(repository, mapper);
    }
}
