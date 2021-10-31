package com.example.okab.spring.test.docker.maven.domain.service.impl;

import com.example.okab.spring.test.docker.maven.domain.dto.ProductCreate;
import com.example.okab.spring.test.docker.maven.domain.dto.ProductResponse;
import com.example.okab.spring.test.docker.maven.domain.mapper.ProductMapper;
import com.example.okab.spring.test.docker.maven.domain.model.Product;
import com.example.okab.spring.test.docker.maven.domain.service.ProductService;
import com.example.okab.spring.test.docker.maven.infrastructure.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends GenericServiceImpl<Product, ProductCreate, ProductResponse>
        implements ProductService {


    @Autowired
    public ProductServiceImpl(ProductRepository repository,
                              ProductMapper mapper) {
        super(repository, mapper);
    }
}
