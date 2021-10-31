package com.example.okab.spring.test.docker.maven.domain.mapper;

import java.util.List;

public interface AutoMapper<Model, Response, CreateDto> {

    Model getEntity(Response dto);

    Response getDto(Model entity);

    List<Model> getEntity(List<Response> dto);

    List<Response> getDto(List<Model> entity);

    Model getCreateDto(CreateDto create);
}