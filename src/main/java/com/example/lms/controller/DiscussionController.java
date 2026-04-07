package com.example.lms.controller;

import com.example.lms.model.Discussion;
import com.example.lms.service.DiscussionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/discussions")
@CrossOrigin(origins = "*")
public class DiscussionController {

    private final DiscussionService discussionService;

    public DiscussionController(DiscussionService discussionService) {
        this.discussionService = discussionService;
    }

    @GetMapping
    public List<Discussion> getDiscussions() {
        return discussionService.getAllDiscussions();
    }
}
