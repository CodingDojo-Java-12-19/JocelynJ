package com.jocelyn.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@RequestMapping("/coding")
public class CodingController {

	public static void main(String[] args) {
		SpringApplication.run(CodingController.class, args);
	}
	
	@RequestMapping("")
	public String index() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/python")
	public String python() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring is better!";
	}
}


//	public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
//	    return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
//	}


/*
Create a controller named 'CodingController'. For the first 3 routes, use the @RequestMapping annotation.
Have an http GET request to 'http://localhost:8080/coding' display a text that says 'Hello Coding Dojo!'.
Have an http GET request to 'http://localhost:8080/coding/python' display a text that says 'Python/Django was awesome!'.
Have an http GET request to 'http://localhost:8080/coding/java' display a text that says 'Java/Spring is better!'.
Create another controller named 'DojoController'. For the routes below, use the @PathVariable annotation.
Have an http GET request to 'http://localhost:8080/dojo' display a text that says 'The dojo is awesome!'.
Have an http GET request to 'http://localhost:8080/burbank-dojo/' display a text that says 'Burbank Dojo is located in Southern California'.
Have an http GET request to 'http://localhost:8080/san-jose/' display a text that says 'SJ dojo is the headquarters'.
*/