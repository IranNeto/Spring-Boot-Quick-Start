package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//This class will be a business service
// A Singleton when the application starts up spring creates an instance of this service
//and then it keeps that in memory

//If it's necessary an instance of this services isn't necessary create a new instance every time
//as a Singleton it needs the instance that spring created as service

@Service
public class TopicService {
	//When Spring executes this method it return an object (list of topics)
	//This object is automatically converted to a JSON
	
	//The generated JSON has key names corresponding to property names of Topic class
	//and their values are the values of those properties
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic()
		);
			
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	//Java 8 way to do this more elegant. With streams and lambda functions
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
