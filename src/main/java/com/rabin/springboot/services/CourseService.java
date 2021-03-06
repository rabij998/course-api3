package com.rabin.springboot.services;

import com.rabin.springboot.entities.Course;
import com.rabin.springboot.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public List<Course> getAllCourses()
    {
        List<Course> courses=new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return  courses;

    }
  /*  public Course getCourseById(String id)
    {
        return courseRepository.findById(id).get();
    }*/
    public Course getCourseByName(String name)
    {
    return courseRepository.findCourseByName(name);
    }
    public void addCourse(Course course)
    {
        courseRepository.save(course);
    }
    public void updateCourse(Course course)
    {
        courseRepository.save(course);
    }
    public void deleteCourse(String id)
    {
        courseRepository.deleteById(id);
    }
}
