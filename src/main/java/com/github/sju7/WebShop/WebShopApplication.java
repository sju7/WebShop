package com.github.sju7.WebShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.security.core.parameters.P;

@SpringBootApplication
public class WebShopApplication {

	public static void main(String[] args) {
		System.out.println("PROD");
		SpringApplication.run(WebShopApplication.class, args);
	}

}
