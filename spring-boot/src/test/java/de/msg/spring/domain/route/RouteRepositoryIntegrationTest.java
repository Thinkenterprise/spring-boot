package de.msg.spring.domain.route;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ActiveProfiles;

import de.msg.spring.domain.core.AbstractIntegrationTest;
import de.msg.spring.domain.route.repository.RouteRepository;

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
public class RouteRepositoryIntegrationTest extends AbstractIntegrationTest{

	@Autowired
	private RouteRepository routeRepository;
		
	@Test
	public void createRoute() {
		
		Route route = routeRepository.save(RouteTestTexture.createSimpleRoute());
		
		Assert.assertNotNull(routeRepository.findOne(route.getId()));
		
	}
	
	@Test
	public void findRoute() {
		
		Route route = routeRepository.save(RouteTestTexture.createSimpleRoute());
		
		Assert.assertTrue(routeRepository.findByDestination("Koeln").iterator().hasNext());
		
	}

	@Test
	public void findRouteWithQuery() {
		
		Route route = routeRepository.save(RouteTestTexture.createSimpleRoute());
		
		Assert.assertTrue(routeRepository.findByDestinationWithQuery("Koeln").iterator().hasNext());
		
	}
	
	@Test
	public void findAllPage() {
		
		Pageable pageable = new PageRequest(1, 1);
		
		Route route = routeRepository.save(RouteTestTexture.createSimpleRoute());
		
		Page page = routeRepository.findAll(pageable);
		
				
		Assert.assertTrue(page.getContent().size()==1);
		
	}
	
	
	@Test
	public void findAllJpa() {
		
			
		Route route = routeRepository.save(RouteTestTexture.createSimpleRoute());
		
		List<Route> routes = routeRepository.findAllJpa();
		
				
		Assert.assertTrue(routes.size()>0);
		
	}


	
}
