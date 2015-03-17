package de.msg.spring.domain.route;

import java.util.Calendar;

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

public class RouteTestTexture {

	public static Route createSimpleRoute() {
		
		Route route = new Route("LH444", "Koeln", "Muenchen");
		
		Flight flight = new Flight(120.45, Calendar.getInstance().getTime() );
		route.addFlight(flight);
		flight = new Flight(120.45, Calendar.getInstance().getTime() );
		route.addFlight(flight);
		flight = new Flight(120.09, Calendar.getInstance().getTime() );
		route.addFlight(flight);
		
		
		route = new Route("LH408", "Koeln", "Hamburg");
		
		flight = new Flight(123.45, Calendar.getInstance().getTime() );
		route.addFlight(flight);
		flight = new Flight(156.01, Calendar.getInstance().getTime() );
		route.addFlight(flight);
		
		
		
		
		route = new Route("LH001", "Bonn", "Berlin");
		
		flight = new Flight(200.45, Calendar.getInstance().getTime() );
		route.addFlight(flight);
		
				
		
		return route;
		
		
	}
	
	
	
}
