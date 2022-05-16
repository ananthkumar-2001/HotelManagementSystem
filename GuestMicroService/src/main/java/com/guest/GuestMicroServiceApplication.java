package com.guest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class GuestMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuestMicroServiceApplication.class, args);
	}

}
