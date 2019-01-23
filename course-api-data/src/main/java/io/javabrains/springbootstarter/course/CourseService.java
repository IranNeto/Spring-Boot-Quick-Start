package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//This class will be a business service
// A Singleton when the application starts up spring creates an instance of this service
//and then it keeps that in memory

//If it's necessary an instance of this services isn't necessary create a new instance every time
//as a Singleton it needs the instance that spring created as service

@Service
public class CourseService {
	//When Spring executes this method it return an object (list of topics)
	//This object is automatically converted to a JSON
	
	//The generated JSON has key names corresponding to property names of Topic class
	//and their values are the values of those properties
	
	private List<Course> courses = new ArrayList<>();
	
	@Autowired
	private CourseDAO coursedao;
	
	
	public List<Course> getAllCourses(String topicId){
		return coursedao.findByTopicId(topicId);
	}
	
	//Java 8 way to do this more elegant. With streams and lambda functions
	public Course getCourse(String id) {
		return coursedao.findById(id).get();
	}

	public void addCourse(Course course) {
		coursedao.save(course);
		
	}

	//the save method can add and update cause it's been passed a topic instance which has already been mapped by the id
	public void updateCourse(Course course) {
		coursedao.save(course);
	}

	public void deleteCourse(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		coursedao.deleteById(id);
	}

}
