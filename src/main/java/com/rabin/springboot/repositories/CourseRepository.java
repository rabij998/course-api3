package com.rabin.springboot.repositories;

import com.rabin.springboot.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course,String> {
    public Course findCourseByName(String name);
}
