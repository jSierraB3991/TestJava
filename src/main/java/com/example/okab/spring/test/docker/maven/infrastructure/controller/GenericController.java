package com.example.okab.spring.test.docker.maven.infrastructure.controller;

import com.example.okab.spring.test.docker.maven.domain.mapper.AutoMapper;
import com.example.okab.spring.test.docker.maven.domain.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequiredArgsConstructor
public abstract class GenericController<Response, Model, CreateDto> {

    private final GenericService<Model, CreateDto> service;
    private final AutoMapper<Model,Response, CreateDto> mapper;

    @PostMapping
    public Response save(@RequestBody CreateDto dto){
        return mapper.getDto(service.save(dto));
    }

    @GetMapping
    public List<Response> findAll(){
        return mapper.getDto(service.findAll());
    }

    @GetMapping("/{id-entity}")
    public Response findById(@PathVariable("id-entity") Long idEntity){
        return mapper.getDto(service.findById(idEntity));
    }

    @PutMapping("/{id-entity}")
    public Response update(@PathVariable("id-entity") Long idEntity, @RequestBody CreateDto dto){
        return mapper.getDto(service.update(idEntity, dto));
    }

    @DeleteMapping("/{id-entity}")
    public void delete(@PathVariable("id-entity") Long idEntity){
        service.deleteById(idEntity);
    }
}
