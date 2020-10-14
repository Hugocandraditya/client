package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@Value("${rest.greeting:default value}")
	private String greetingMessage;

	@Autowired
	private Environment env;
	
	@GetMapping("/greeting")
	public String greeting() {
		return "rest.greeting: " + greetingMessage;
	}
	
	@GetMapping("/envdetail")
	public String envDetail() {
		return env.toString();
	}
}
