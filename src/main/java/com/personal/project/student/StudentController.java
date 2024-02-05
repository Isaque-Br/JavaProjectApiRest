package com.personal.project.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController  // Will have a request and then...
@RequestMapping(path = "api/v1/student")    // mapping in here pass path, will be api and then v1
public class StudentController {

    @GetMapping
    public List<Student>  getStudents() {
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
