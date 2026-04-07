package com.example.lms.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin(origins = "*")
public class DashboardController {

    @GetMapping
    public Map<String, Object> getDashboard() {
        Map<String, Object> map = new HashMap<>();
        map.put("totalCourses", 3);
        map.put("totalAssignments", 3);
        map.put("totalStudents", 120);
        map.put("pendingSubmissions", 5);
        map.put("announcements", 4);
        return map;
    }
}
