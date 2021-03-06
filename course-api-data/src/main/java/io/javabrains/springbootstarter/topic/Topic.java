package io.javabrains.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

//The framework sees the embedded Derby database in the classpath and assumes that to be the database to connect to. No connection information necessary!
@Entity
public class Topic {
	@Id
	public String id;
	public String name;
	public String description;
	
	
	public Topic(){}
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
