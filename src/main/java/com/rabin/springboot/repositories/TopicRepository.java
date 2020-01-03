package com.rabin.springboot.repositories;

import com.rabin.springboot.entities.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepository extends CrudRepository<Topic,String> {
    List<Topic> findAllByCourseId(String courseId);

}
