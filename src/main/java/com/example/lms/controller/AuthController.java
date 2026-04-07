package com.example.lms.controller;

import com.example.lms.model.Role;
import com.example.lms.model.User;
import com.example.lms.service.AuthService;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody LoginRequest request) {
        User user = authService.login(request.getEmail(), request.getPassword(), request.getRole());
        Map<String, Object> response = new HashMap<>();
        if (user == null) {
            response.put("success", false);
            response.put("message", "Invalid email, password, or role");
            return response;
        }
        response.put("success", true);
        response.put("message", "Login successful");
        response.put("token", "demo-token-" + user.getRole().name().toLowerCase());
        response.put("user", user);
        return response;
    }

    public static class LoginRequest {
        @Email
        private String email;
        @NotBlank
        private String password;
        private Role role;

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }

        public Role getRole() { return role; }
        public void setRole(Role role) { this.role = role; }
    }
}
