package com.example.lms.model;

public class Course {

    private Long id;
    private String title;
    private String instructor;
    private String description;
    private int lessons;
    private int students;

    public Course() {}

    public Course(Long id,String title,String instructor,String description,int lessons,int students){
        this.id=id;
        this.title=title;
        this.instructor=instructor;
        this.description=description;
        this.lessons=lessons;
        this.students=students;
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}

    public String getTitle(){return title;}
    public void setTitle(String title){this.title=title;}

    public String getInstructor(){return instructor;}
    public void setInstructor(String instructor){this.instructor=instructor;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description=description;}

    public int getLessons(){return lessons;}
    public void setLessons(int lessons){this.lessons=lessons;}

    public int getStudents(){return students;}
    public void setStudents(int students){this.students=students;}
}