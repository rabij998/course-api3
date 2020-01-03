package com.rabin.springboot.controller;

import com.rabin.springboot.entities.Course;
import com.rabin.springboot.entities.Topic;
import com.rabin.springboot.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @RequestMapping("/courses/{courseId}/topics")
    public List<Topic> getAllTopics(@PathVariable String courseId)
    {
        return topicService.findAllTopics(courseId);
    }
    @RequestMapping(method =RequestMethod.POST,value = "/courses/{courseId}/topics")
    public void saveTopic(@RequestBody Topic topic,@PathVariable String courseId)
    {
        topic.setCourse(new Course(courseId,"",""));
        topicService.addTopic(topic);
    }
    @RequestMapping(method =RequestMethod.PUT,value = "/courses/{courseId}/topics/{topicId}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String courseId,@PathVariable String topicId)
    {
        topic.setId(topicId);
        topic.setCourse(new Course(courseId,"",""));
        topicService.addTopic(topic);
    }
    @RequestMapping(method =RequestMethod.DELETE,value = "/courses/{courseId}/topics/{topicId}")
    public void deleteTopic(@PathVariable final String topicId)
    {
        topicService.deleteTopic(topicId);
    }
}
