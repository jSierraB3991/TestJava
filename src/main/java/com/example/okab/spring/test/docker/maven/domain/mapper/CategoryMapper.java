package com.example.okab.spring.test.docker.maven.domain.mapper;

import com.example.okab.spring.test.docker.maven.domain.dto.CategoryCreate;
import com.example.okab.spring.test.docker.maven.domain.dto.CategoryResponse;
import com.example.okab.spring.test.docker.maven.domain.model.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends AutoMapper<Category, CategoryResponse, CategoryCreate> {
}
