package com.example.demo.controllers;

import com.example.demo.entites.Topic;
import com.example.demo.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by eugene on 12/1/17.
 */
@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable("id") String id) {
        return topicService.getTopicById(id);
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }
    @PutMapping("/topics/{id}")
    public void updateTopicById(@RequestBody Topic topic,@PathVariable("id") String id) {
        topicService.updateTopicById(id,topic);
    }
    @DeleteMapping("/topics/{id}")
    public void deleteTopicById(@PathVariable("id") String id) {
        topicService.deleteTopicById(id);
    }
}
