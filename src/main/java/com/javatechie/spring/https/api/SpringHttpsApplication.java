package com.javatechie.spring.https.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHttpsApplication {

	@GetMapping("/getData")
	public String getMessage() {
		return "Accessed by HTTPS protocol";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringHttpsApplication.class, args);
	}
}
