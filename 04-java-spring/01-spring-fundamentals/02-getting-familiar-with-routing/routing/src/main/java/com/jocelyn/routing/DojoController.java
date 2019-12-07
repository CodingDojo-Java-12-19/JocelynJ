package com.jocelyn.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/dojo")
@RestController
public class DojoController {
	@RequestMapping("")
	public String index() {
		return "The dojo is awesome!";
	}
	
	@RequestMapping("/{name}/{location}")
	public String index(@PathVariable("name") String name, @PathVariable("location") String location) {

			return name + " Dojo is located in " + location;
		
	}

}