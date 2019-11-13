package io.javabrains.springbootstarter.services;

import io.javabrains.springbootstarter.repositories.TopicRepository;
import io.javabrains.springbootstarter.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getTopics(){
        List<Topic> topics = new ArrayList<>();
         topicRepository.findAll().forEach(topics :: add);
         return topics;
    }

    public Topic getTopic(int id){
         return  topicRepository.findById(id).get();
    }


    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }


    public void editTopic( Topic topic,  int id)
    {
         topicRepository.save(topic);
    }
//    }

    public void deleteTopic(int id) {
        topicRepository.deleteById(id);
    }
}
