package com.example.dockerisation_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Dockerisation1Application {

	public static void main(String[] args) {
		SpringApplication.run(Dockerisation1Application.class, args);
	}

	@RestController
    	public static class HelloService {
        	@GetMapping("/")
        	public String hello() {
            		return "hello";
        	}
    	}

}
