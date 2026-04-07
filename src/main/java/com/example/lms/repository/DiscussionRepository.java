package com.example.lms.repository;

import com.example.lms.model.Discussion;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DiscussionRepository {
    private final List<Discussion> items = new ArrayList<>();

    public List<Discussion> findAll() {
        return items;
    }

    public void save(Discussion item) {
        items.add(item);
    }
}
