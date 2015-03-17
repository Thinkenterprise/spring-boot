package de.msg.spring.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

/**  Spring Boot Samples 
**  Design and Development by msg Applied Technology Research
**  Copyright (c) 2014 msg systems ag (http://www.msg-systems.com/)
**  All Rights Reserved.
*/


/**
* 
* @author Michael Schäfer
* 
* */


@Configuration
public class HelloWorldConfiguration {

	@Bean
	@Profile(value="production")
	public HelloWorldService helloWorldService() {
		
		return new HelloWorldServiceImpl(); 
		
	}
	
	
	@Profile(value="test")
	@Bean
	public HelloWorldTestServiceImpl helloWorldTestService() {
		
		return new HelloWorldTestServiceImpl(); 
		
	}

}
