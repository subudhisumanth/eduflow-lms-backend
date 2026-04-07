package com.example.lms.service;

import com.example.lms.model.Role;
import com.example.lms.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService {

    private final List<User> users = List.of(
        new User(1L, "John Student", "john@student.com", "123456", Role.STUDENT),
        new User(2L, "Jane Instructor", "jane@eduflow.com", "123456", Role.INSTRUCTOR),
        new User(3L, "Admin User", "admin@eduflow.com", "123456", Role.ADMIN),
        new User(4L, "Alice Creator", "alice@content.com", "123456", Role.CONTENT_CREATOR)
    );

    public User login(String email, String password, Role role) {
        return users.stream()
            .filter(user -> user.getEmail().equalsIgnoreCase(email)
                && user.getPassword().equals(password)
                && user.getRole() == role)
            .findFirst()
            .orElse(null);
    }

    public List<User> getUsers() {
        return users;
    }
}
