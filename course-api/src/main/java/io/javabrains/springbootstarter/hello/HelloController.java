package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Annotation reporting a Rest controller class from Spring MVC
@RestController
public class HelloController {
	
	//Annotation that indicate the action when acessed /hello
	//Use the GET HTTP method by default
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
}
