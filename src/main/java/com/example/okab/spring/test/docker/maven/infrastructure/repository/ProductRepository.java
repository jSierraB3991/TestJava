package com.example.okab.spring.test.docker.maven.infrastructure.repository;

import com.example.okab.spring.test.docker.maven.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
