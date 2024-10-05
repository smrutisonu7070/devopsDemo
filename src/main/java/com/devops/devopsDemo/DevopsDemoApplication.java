package com.devops.devopsDemo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsDemoApplication {

	static Logger logger = LoggerFactory.getLogger(DevopsDemoApplication.class);

	@PostConstruct
	public void initMethod() {
		logger.info("Application Started");
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsDemoApplication.class, args);
		logger.info("Application executed...");
	}

}
