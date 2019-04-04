package com.example.spring_hello_world;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
public class ApplicationConfiguration {

	private static final Logger logger = LoggerFactory.getLogger(ApplicationConfiguration.class);
	public ApplicationConfiguration() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/hello")
	public String hello() {
		logger.debug("this is debug message");
		logger.info("this is info message");
		return "Hello World";
	}

}

