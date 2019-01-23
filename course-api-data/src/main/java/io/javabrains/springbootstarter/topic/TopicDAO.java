package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

// CrudRepository is a class that contains all simple CRUD. The arguments are <Object which the class is working with, what is the data type of the ID>
public interface TopicDAO extends CrudRepository<Topic, String>{

}
