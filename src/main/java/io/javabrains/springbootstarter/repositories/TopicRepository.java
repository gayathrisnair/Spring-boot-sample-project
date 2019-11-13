package io.javabrains.springbootstarter.repositories;

import io.javabrains.springbootstarter.models.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Integer> {
}
