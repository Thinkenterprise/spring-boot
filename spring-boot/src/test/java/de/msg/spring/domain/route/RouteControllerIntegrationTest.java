package de.msg.spring.domain.route;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.context.ActiveProfiles;
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
@ActiveProfiles({"web","test"}) 
public class RouteControllerIntegrationTest extends AbstractWebIntegrationTest {

	@Autowired
	private ApplicationContext context;

	private Authentication authentication;

		
	
	@Test
	public void getAllTest() {
		
		RestTemplate restTemplate = new TestRestTemplate("admin","admin");
		
		ResponseEntity<Iterable> result = restTemplate.getForEntity("http://localhost:8080/routes", Iterable.class);
		
		Assert.assertTrue(result.getBody().iterator().hasNext());
		
		
	}

	
}
