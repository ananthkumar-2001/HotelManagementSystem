package com.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class DepartmentMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentMicroServiceApplication.class, args);
	}

}
