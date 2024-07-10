package com.scaler.productservicejuly24;
import  com.scaler.productservicejuly24.models.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceJuly24Application {

	public static void main(String[] args) {

		SpringApplication.run(ProductServiceJuly24Application.class, args);

		product Product = new product();
		Product.setTitle("iPhone 15 Max Pro");
	}

}
