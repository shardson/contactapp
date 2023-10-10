package com.in28minutes.springboot.learnspringboot.controller;

// URL: /courses
// Return: Course: id, name, author

import com.in28minutes.springboot.learnspringboot.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1L, "learn aws", "in28minutes"),
                new Course(2L, "learn java", "in28minutes"),
                new Course(3L, "learn terraform", "in28minutes")
        );
    }
}
