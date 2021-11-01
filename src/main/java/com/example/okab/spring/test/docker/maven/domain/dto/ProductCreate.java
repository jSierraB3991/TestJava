package com.example.okab.spring.test.docker.maven.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreate {
    private String name;
    private String sku;
    private Integer price;
    private Boolean isDiscount;
    private Long category;
}
