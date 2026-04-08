package com.example.lms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.lms.model.Role;
import com.example.lms.model.User;

@Service
public class AuthService {

    private final List<User> users = new ArrayList<>();

    public AuthService() {
        users.add(new User(1L, "John Student", "john@student.com", "123456", Role.STUDENT));
        users.add(new User(2L, "Jane Instructor", "jane@eduflow.com", "123456", Role.INSTRUCTOR));
        users.add(new User(3L, "Admin User", "admin@eduflow.com", "123456", Role.ADMIN));
        users.add(new User(4L, "Alice Creator", "alice@content.com", "123456", Role.CONTENT_CREATOR));
    }

    public User login(String email, String password, Role role) {
        return users.stream()
            .filter(user -> user.getEmail().equalsIgnoreCase(email)
                && user.getPassword().equals(password)
                && user.getRole() == role)
            .findFirst()
            .orElse(null);
    }

    public User register(String name, String email, String password, Role role) {
        boolean exists = users.stream()
            .anyMatch(user -> user.getEmail().equalsIgnoreCase(email));

        if (exists) {
            return null;
        }

        Long nextId = (long) (users.size() + 1);
        User newUser = new User(nextId, name, email, password, role);
        users.add(newUser);
        return newUser;
    }

    public List<User> getUsers() {
        return users;
    }
}