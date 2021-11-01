package com.example.okab.spring.test.docker.maven.infrastructure.repository;

import com.example.okab.spring.test.docker.maven.domain.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
