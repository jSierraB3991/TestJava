package com.example.okab.spring.test.docker.maven.infrastructure.controller;

import com.example.okab.spring.test.docker.maven.domain.dto.ProductCreate;
import com.example.okab.spring.test.docker.maven.domain.dto.ProductResponse;
import com.example.okab.spring.test.docker.maven.domain.mapper.ProductMapper;
import com.example.okab.spring.test.docker.maven.domain.model.Product;
import com.example.okab.spring.test.docker.maven.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController extends GenericController<ProductResponse, Product, ProductCreate> {

    @Autowired
    public ProductController(ProductService service,
                             ProductMapper mapper) {
        super(service, mapper);
    }
}
