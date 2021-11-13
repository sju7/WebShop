package com.github.sju7.WebShop.model;

import lombok.Value;

@Value
public class Product {
    private int id;
    private String name;
    private String description;
    private String category;
    private int stock;

}
