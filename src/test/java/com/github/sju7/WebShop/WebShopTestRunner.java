package com.github.sju7.WebShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class WebShopTestRunner {
    public static void main(String[] args) {
        SpringApplication.run(WebShopApplication.class, args);
    }
}
