package com.example.lms.service;

import com.example.lms.model.Course;
import com.example.lms.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourse(Long id, Course updated) {
        return courseRepository.findById(id).map(course -> {
            course.setTitle(updated.getTitle());
            course.setInstructor(updated.getInstructor());
            course.setDescription(updated.getDescription());
            course.setLessons(updated.getLessons());
            course.setStudents(updated.getStudents());
            return courseRepository.save(course);
        }).orElse(null);
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}