package com.github.sju7.WebShop.api.productapi;

import lombok.Value;

@Value
public class ProductRequest {
    String name;
    String description;
    String categori;
    int stock;
}
