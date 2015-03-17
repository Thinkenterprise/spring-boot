package de.msg.spring.domain.route;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


@Service
public class RouteInitializer {

	
	private RouteRepository routeRepository;

	@Autowired
	public RouteInitializer(RouteRepository routeRepository) {
		super();
		this.routeRepository = routeRepository;
		
		
		Route route = new Route("LH444", "Koeln", "Muenchen");
		
		Flight flight = new Flight(120.45, Calendar.getInstance().getTime() );
		route.addFlight(flight);
		
		flight = new Flight(111.45, Calendar.getInstance().getTime() );
		route.addFlight(flight);
		
		routeRepository.save(route);
	}
	
	
	
}
