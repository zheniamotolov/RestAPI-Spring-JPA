package com.example.demo.services;

import com.example.demo.data.TopicRepository;
import com.example.demo.entites.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by eugene on 12/1/17.
 */
@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1", "b", "c")));

    public List<Topic> getTopics() {
        // return topics;
        return (List<Topic>) topicRepository.findAll();

    }

    public Topic getTopicById(String id) {
        return topicRepository.findOne(id);
        // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        //  topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopicById(String id, Topic topic) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topic temp = topics.get(i);
//            if (temp.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopicById(String id) {
        topicRepository.delete(id);
     //   topics.removeIf(t -> t.getId().equals(id));
    }

}
