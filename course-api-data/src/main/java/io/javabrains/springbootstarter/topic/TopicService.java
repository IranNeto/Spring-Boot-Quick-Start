package io.javabrains.springbootstarter.topic;

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
public class TopicService {
	//When Spring executes this method it return an object (list of topics)
	//This object is automatically converted to a JSON
	
	//The generated JSON has key names corresponding to property names of Topic class
	//and their values are the values of those properties
	
	private List<Topic> topics = new ArrayList<>();
	
	@Autowired
	private TopicDAO topicdao;
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicdao.findAll().forEach(topics::add);
		return topics;
	}
	
	//Java 8 way to do this more elegant. With streams and lambda functions
	public Topic getTopic(String id) {
		return topicdao.findById(id).get();
	}

	public void addTopic(Topic topic) {
		topicdao.save(topic);
		
	}

	//the save method can add and update cause it's been passed a topic instance which has already been mapped by the id
	public void updateTopic(String id, Topic topic) {
		topicdao.save(topic);
	}

	public void deleteTopic(String id, Topic topic) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicdao.delete(topic);
	}

}
