package de.msg.spring.sample;

import org.springframework.stereotype.Service;

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

public class HelloWorldServiceImpl implements HelloWorldService {

	
	private String helloWorld = "Hello World von Service";

	
	@Override
	public String getHelloWorld() {
		return helloWorld;
	}

	
	@Override
	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}
	
	
	
	
}
