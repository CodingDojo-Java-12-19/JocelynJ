package com.jocelyn.human;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@RequestMapping("/")
public class HumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanApplication.class, args);
	}

	@RequestMapping("")
	public String index() {
		return "Hello Human!";
	}
	
	@RequestMapping("/human/")
	public String index(@RequestParam(value="name", required=false) String name) {
        return "Hello " + name + "!";
    }
}
