package com.personal.project;

import com.personal.project.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class PersonalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalProjectApplication.class, args);
	}

	@GetMapping
	public List<Student> student() {
		return List.of(
				new Student(
						1L,
						"Isaque",
						"isaque@gmail.com",
						LocalDate.of(1991, Month.SEPTEMBER, 11),
						32
				)
		);
	}
}
