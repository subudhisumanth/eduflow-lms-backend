package com.example.lms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.lms.model.Course;

@Service
public class CourseService {

    private final List<Course> courses = new ArrayList<>();

    public CourseService(){
        courses.add(new Course(1L,"Full Stack Application Development","Dr. Smith","React + Spring Boot LMS project",24,120));
        courses.add(new Course(2L,"Database Management Systems","Prof. Brown","SQL and normalization",18,95));
    }

    public List<Course> getCourses(){
        return courses;
    }

    public Course addCourse(Course course){
        course.setId((long)(courses.size()+1));
        courses.add(course);
        return course;
    }

    public Course updateCourse(Long id,Course updated){
        Course c = courses.stream().filter(x->x.getId().equals(id)).findFirst().orElse(null);
        if(c!=null){
            c.setTitle(updated.getTitle());
            c.setInstructor(updated.getInstructor());
            c.setDescription(updated.getDescription());
            c.setLessons(updated.getLessons());
        }
        return c;
    }

    public void deleteCourse(Long id){
        courses.removeIf(c->c.getId().equals(id));
    }
}