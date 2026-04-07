package com.example.lms.repository;

import com.example.lms.model.Enrollment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EnrollmentRepository {
    private final List<Enrollment> items = new ArrayList<>();

    public List<Enrollment> findAll() {
        return items;
    }

    public void save(Enrollment item) {
        items.add(item);
    }
}
