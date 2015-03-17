package de.msg.spring.domain.route;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import de.msg.spring.domain.core.AbstractWebIntegrationTest;

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

public class RouteControllerIntegrationTest extends AbstractWebIntegrationTest {

	@Test
	public void getAllTest() {
		
		RestTemplate restTemplate = new TestRestTemplate();
		
		ResponseEntity<Iterable> result = restTemplate.getForEntity("http://localhost:8080/routes", Iterable.class);
		
		Assert.assertTrue(result.getBody().iterator().hasNext());
		
		
	}

	
}
