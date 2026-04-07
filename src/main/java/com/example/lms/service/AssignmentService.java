package com.example.lms.service;

import com.example.lms.model.Assignment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {

    public List<Assignment> getAllAssignments() {
        return List.of(
            new Assignment(1L, "LMS Project Review 2", "Full Stack Application Development", "2026-04-11", "Pending"),
            new Assignment(2L, "SQL Practice Set", "Database Management Systems", "2026-04-09", "Completed"),
            new Assignment(3L, "Routing Protocol Report", "Computer Networks", "2026-04-15", "Pending")
        );
    }
}
