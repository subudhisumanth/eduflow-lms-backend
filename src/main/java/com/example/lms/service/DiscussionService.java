package com.example.lms.service;

import com.example.lms.model.Discussion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussionService {

    public List<Discussion> getAllDiscussions() {
        return List.of(
            new Discussion(1L, "John Student", "Project Review Doubts", "Can we use separate repositories for frontend and backend?"),
            new Discussion(2L, "Jane Instructor", "Submission Guidelines", "Please upload deployment link before review."),
            new Discussion(3L, "Alice Creator", "UI Improvements", "Try improving dashboard cards and spacing.")
        );
    }
}
