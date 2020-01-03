package com.rabin.springboot.controller;

import com.rabin.springboot.entities.Course;
import com.rabin.springboot.services.CourseService;
import com.rabin.springboot.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("/courses")
    public List<Course> getAllCourses()
    {
        return courseService.getAllCourses();
    }
   /* @RequestMapping("/courses/{id}")
    public Course getCourseById(@PathVariable final String id)
    {
        return courseService.getCourseById(id);
    }*/
    @RequestMapping("/courses/{name}")
    public Course getCourseByName(@PathVariable final String name)
    {
        return courseService.getCourseByName(name);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/courses")
    public void saveCourse(@RequestBody Course course)
    {
        courseService.addCourse(course);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/courses/{id}")
    public void updateCourse(@RequestBody Course course,@PathVariable final String id)
    {
        course.setId(id);
        courseService.updateCourse(course);
    }
    @RequestMapping(method =RequestMethod.DELETE,value = "/courses/{id}")
    public void deleteCourse(@PathVariable final String id)
    {
        courseService.deleteCourse(id);
    }
}
