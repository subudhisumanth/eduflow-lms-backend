package com.example.lms.repository;

import com.example.lms.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {
    private final List<Course> items = new ArrayList<>();

    public List<Course> findAll() {
        return items;
    }

    public void save(Course item) {
        items.add(item);
    }
}
