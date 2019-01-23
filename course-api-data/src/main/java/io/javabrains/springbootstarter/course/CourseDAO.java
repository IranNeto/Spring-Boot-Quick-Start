package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

// CrudRepository is a class that contains all simple CRUD. The arguments are <Object which the class is working with, what is the data type of the ID>

//CrudRepository also support customs methods or it can generate customs methods based on the name of the method
// findById() -> Select by this id
// findTopicById -> select a topic given the Topic's id
// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-creation

public interface CourseDAO extends CrudRepository<Course, String>{
	public List<Course> findByTopicId(String topicId);
}
