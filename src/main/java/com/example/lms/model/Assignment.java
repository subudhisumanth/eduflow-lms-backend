package com.example.lms.model;

public class Assignment {
    private Long id;
    private String title;
    private String courseTitle;
    private String dueDate;
    private String status;

    public Assignment() {}

    public Assignment(Long id, String title, String courseTitle, String dueDate, String status) {
        this.id = id;
        this.title = title;
        this.courseTitle = courseTitle;
        this.dueDate = dueDate;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCourseTitle() { return courseTitle; }
    public void setCourseTitle(String courseTitle) { this.courseTitle = courseTitle; }

    public String getDueDate() { return dueDate; }
    public void setDueDate(String dueDate) { this.dueDate = dueDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
