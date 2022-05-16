package com.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class InventoryMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryMicroServiceApplication.class, args);
	}

}
