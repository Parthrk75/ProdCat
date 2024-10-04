package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example", "com.example.entity","com.example.repositories","com.example.controllers","com.example.service"})
public class ProdCatManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdCatManagerApplication.class, args);
	}

}
