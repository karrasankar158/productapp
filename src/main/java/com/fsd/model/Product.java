package com.fsd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString //@Data
@AllArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private Long price;
}
