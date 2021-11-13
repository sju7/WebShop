package com.github.sju7.WebShop.api.product;

import lombok.Value;

@Value
public class ProductRequest {
    String name;
    String description;
    String category;
    int stock;
}
