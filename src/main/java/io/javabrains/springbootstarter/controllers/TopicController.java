package io.javabrains.springbootstarter.controllers;

import io.javabrains.springbootstarter.models.Topic;
import io.javabrains.springbootstarter.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getTopics();

    }

    @RequestMapping("/topics/{id}/{test}")
    public Topic getTopic(@PathVariable int id, @PathVariable String test) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public  void addTopic( @RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void editTopic(@RequestBody Topic topic, @PathVariable int id) {
            topicService.editTopic(topic, id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable int  id){
        topicService.deleteTopic(id);
    }


}
