package com.rabin.springboot.services;

import com.rabin.springboot.entities.Topic;
import com.rabin.springboot.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    public List<Topic> findAllTopics(String courseId)
    {
        List<Topic> topics=new ArrayList<>();
       topicRepository.findAllByCourseId(courseId).forEach(topics::add);
       return topics;
    }
    public Topic findById(String id)
    {
        return topicRepository.findById(id).get();
    }
    public void addTopic(Topic topic)
    {
        topicRepository.save(topic);
    }
    public void updateTopic(Topic topic)
    {
        topicRepository.save(topic);
    }
    public void deleteTopic(String id)
    {
        topicRepository.deleteById(id);
    }
}
