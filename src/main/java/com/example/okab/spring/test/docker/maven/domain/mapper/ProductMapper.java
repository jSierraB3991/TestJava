package com.example.okab.spring.test.docker.maven.domain.mapper;

import com.example.okab.spring.test.docker.maven.domain.dto.ProductCreate;
import com.example.okab.spring.test.docker.maven.domain.dto.ProductResponse;
import com.example.okab.spring.test.docker.maven.domain.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ProductMapper extends AutoMapper<Product, ProductResponse, ProductCreate> {


    @Mappings({@Mapping(target = "category.id", source = "create.category")})
    Product getCreateDto(ProductCreate create);
}
