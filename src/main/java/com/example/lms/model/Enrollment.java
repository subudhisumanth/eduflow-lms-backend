package com.example.lms.model;

public class Enrollment {
    private Long id;
    private String studentName;
    private String courseTitle;
    private String enrolledOn;

    public Enrollment() {}

    public Enrollment(Long id, String studentName, String courseTitle, String enrolledOn) {
        this.id = id;
        this.studentName = studentName;
        this.courseTitle = courseTitle;
        this.enrolledOn = enrolledOn;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getCourseTitle() { return courseTitle; }
    public void setCourseTitle(String courseTitle) { this.courseTitle = courseTitle; }

    public String getEnrolledOn() { return enrolledOn; }
    public void setEnrolledOn(String enrolledOn) { this.enrolledOn = enrolledOn; }
}
