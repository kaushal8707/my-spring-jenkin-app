package com.java.selfdeveloped.cloud.jenkins.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class MySpringJenkinAppApplication {

	public static Logger logger = LoggerFactory.getLogger(MySpringJenkinAppApplication.class);

	@GetMapping("/call")
	public String message() {
		return "Wao!! Application Deployed successfully in SAP Cloud..";
	}
	
	@PostConstruct
	public void init() {
		logger.info("Hi I am newley added ...Application started !!");

	}
	
	public static void main(String[] args) {
		logger.info("I am also newely added log statement print-------- started !!");
		SpringApplication.run(MySpringJenkinAppApplication.class, args);
	}

}
