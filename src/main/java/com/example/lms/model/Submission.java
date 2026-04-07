package com.example.lms.model;

public class Submission {
    private Long id;
    private String studentName;
    private String assignmentTitle;
    private String submittedOn;
    private String grade;

    public Submission() {}

    public Submission(Long id, String studentName, String assignmentTitle, String submittedOn, String grade) {
        this.id = id;
        this.studentName = studentName;
        this.assignmentTitle = assignmentTitle;
        this.submittedOn = submittedOn;
        this.grade = grade;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getAssignmentTitle() { return assignmentTitle; }
    public void setAssignmentTitle(String assignmentTitle) { this.assignmentTitle = assignmentTitle; }

    public String getSubmittedOn() { return submittedOn; }
    public void setSubmittedOn(String submittedOn) { this.submittedOn = submittedOn; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}
