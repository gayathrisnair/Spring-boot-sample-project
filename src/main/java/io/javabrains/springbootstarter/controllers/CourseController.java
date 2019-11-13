package io.javabrains.springbootstarter.controllers;

import io.javabrains.springbootstarter.models.Course;
import io.javabrains.springbootstarter.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();

    }

    @RequestMapping("/courses/{id}/{test}")
    public Course getCourse(@PathVariable int id, @PathVariable String test) {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public  void addCourse( @RequestBody Course topic){
        courseService.addCourse(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
    public void editTopic(@RequestBody Course topic, @PathVariable int id){
        courseService.editCourse(topic, id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
    public void deleteCourse(@PathVariable int  id){
        courseService.deleteCourse(id);

    }


}
