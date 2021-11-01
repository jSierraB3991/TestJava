package com.example.okab.spring.test.docker.maven.domain.service.impl;

import com.example.okab.spring.test.docker.maven.domain.mapper.AutoMapper;
import com.example.okab.spring.test.docker.maven.domain.service.GenericService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public abstract class GenericServiceImpl<Model, CreateDto, Response> implements GenericService<Model, CreateDto> {

    private final JpaRepository<Model, Long> repository;
    private final AutoMapper<Model, Response, CreateDto> mapper;

    @Override
    public Model save(CreateDto entity) {
        log.info("Saving: {}", entity);
        return repository.save(mapper.getCreateDto(entity));
    }

    @Override
    public List<Model> findAll() {
        return repository.findAll();
    }

    @Override
    public Model findById(Long id) {
        log.info("Find By: {}", id);
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("The id not exits"));
    }

    @Override
    public Model update(Long id, CreateDto entity) {
        findById(id);
        return save(entity);
    }

    @Override
    public void deleteById(Long id) {
        findById(id);
        log.info("Delete By: {}", id);
        repository.deleteById(id);
    }
}
