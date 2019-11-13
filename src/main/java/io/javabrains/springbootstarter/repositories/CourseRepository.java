package io.javabrains.springbootstarter.repositories;

import io.javabrains.springbootstarter.models.Course;
import io.javabrains.springbootstarter.models.Topic;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository  extends CrudRepository<Course, Integer> {

    public Course findByTopic(Topic topic);
}
