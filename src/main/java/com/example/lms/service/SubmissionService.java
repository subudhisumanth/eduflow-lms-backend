package com.example.lms.service;

import com.example.lms.model.Submission;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmissionService {

    public List<Submission> getAllSubmissions() {
        return List.of(
            new Submission(1L, "John Student", "SQL Practice Set", "2026-04-04", "A"),
            new Submission(2L, "John Student", "Wireframe Design", "2026-04-02", "A-")
        );
    }
}
