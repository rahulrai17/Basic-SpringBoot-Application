package com.example.Basic_SpringBoot_Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BasicSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringBootApplication.class, args);
	}
		@RestController
		class HelloController {
			@GetMapping("/hello")
			public String hello() {
				return "Hello, Spring Boot!";
			}
		}
}
