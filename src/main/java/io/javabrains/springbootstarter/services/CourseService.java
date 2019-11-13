package io.javabrains.springbootstarter.services;

import io.javabrains.springbootstarter.models.Course;
import io.javabrains.springbootstarter.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getCourses(){
        List<Course> topics = new ArrayList<>();
        courseRepository.findAll().forEach(topics :: add);
        return topics;
    }

    public Course getCourse(int id){
        return  courseRepository.findById(id).get();
    }


    public void addCourse(Course topic) {
        courseRepository.save(topic);
    }


    public void editCourse( Course topic,  int id)
    {
        courseRepository.save(topic);
    }
//    }

    public void deleteCourse(int id) {
        courseRepository.deleteById(id);
    }
}
