package com.example.lms.repository;

import com.example.lms.model.Submission;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SubmissionRepository {
    private final List<Submission> items = new ArrayList<>();

    public List<Submission> findAll() {
        return items;
    }

    public void save(Submission item) {
        items.add(item);
    }
}
