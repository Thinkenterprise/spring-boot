package de.msg.spring.sample;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import de.msg.spring.ApplicationConfiguration;
import de.msg.spring.sample.HelloWorldTestServiceImpl;

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

@RunWith(SpringJUnit4ClassRunner.class)
@WebIntegrationTest
@SpringApplicationConfiguration(classes={ApplicationConfiguration.class})
public class TestHelloWorld {

	@Test
	public void testHelloWorld() {
		
		RestTemplate restTemplate = new TestRestTemplate();
		
		ResponseEntity<String> result = restTemplate.getForEntity("http://localhost:8080/helloWorld", String.class);
		
		Assert.assertEquals(result.getBody(), HelloWorldTestServiceImpl.helloWorld);
		
		
	}
	
	
	
}
