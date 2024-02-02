package com.personal.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class PersonalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalProjectApplication.class, args);
	}

	@GetMapping
	public List<String> hello() {						// Only Endpoint here
		return List.of ("Hello", "World");					// Chance Endpoint List for have a Jason back
	}

}
