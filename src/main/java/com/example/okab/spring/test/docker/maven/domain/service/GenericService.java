package com.example.okab.spring.test.docker.maven.domain.service;

import java.util.List;

public interface GenericService<Model, CreateDto> {

    Model save(CreateDto entity);

    List<Model> findAll();

    Model findById(Long id);

    Model update(Long id, CreateDto entity);

    void deleteById(Long id);
}
