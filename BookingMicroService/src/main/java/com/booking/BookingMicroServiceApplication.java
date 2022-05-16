package com.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class BookingMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingMicroServiceApplication.class, args);
	}

}
