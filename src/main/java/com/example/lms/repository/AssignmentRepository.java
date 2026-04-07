package com.example.lms.repository;

import com.example.lms.model.Assignment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AssignmentRepository {
    private final List<Assignment> items = new ArrayList<>();

    public List<Assignment> findAll() {
        return items;
    }

    public void save(Assignment item) {
        items.add(item);
    }
}
