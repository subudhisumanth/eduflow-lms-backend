package com.example.lms.repository;

import com.example.lms.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> items = new ArrayList<>();

    public List<User> findAll() {
        return items;
    }

    public void save(User item) {
        items.add(item);
    }
}
