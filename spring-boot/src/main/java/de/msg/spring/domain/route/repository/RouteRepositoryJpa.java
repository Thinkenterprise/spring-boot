package de.msg.spring.domain.route.repository;

import java.util.List;

import de.msg.spring.domain.route.Route;

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

public interface RouteRepositoryJpa {

	public List<Route> findAllJpa();
	
}
