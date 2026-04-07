package com.example.lms.service;

import com.example.lms.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    public List<Course> getAllCourses() {
        return List.of(
            new Course(1L, "Full Stack Application Development", "Dr. Smith", "React + Spring Boot LMS project course.", 24, 120),
            new Course(2L, "Database Management Systems", "Prof. Brown", "SQL, MySQL, and normalization.", 18, 95),
            new Course(3L, "Computer Networks", "Ms. Jane", "Networking basics and protocols.", 20, 88)
        );
    }
}
