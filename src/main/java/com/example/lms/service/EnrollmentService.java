package com.example.lms.service;

import com.example.lms.model.Enrollment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {

    public List<Enrollment> getAllEnrollments() {
        return List.of(
            new Enrollment(1L, "John Student", "Full Stack Application Development", "2026-01-10"),
            new Enrollment(2L, "John Student", "Database Management Systems", "2026-01-12"),
            new Enrollment(3L, "John Student", "Computer Networks", "2026-01-14")
        );
    }
}
