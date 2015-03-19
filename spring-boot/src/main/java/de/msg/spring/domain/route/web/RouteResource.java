package de.msg.spring.domain.route.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.msg.spring.domain.route.Route;
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

@Profile("web")
@RestController
@RequestMapping(value="routes")
public class RouteResource {
	
	@Autowired
	private RouteRepository routeRepository;
	
	
	
	@RequestMapping(value="{id}")
	public ResponseEntity<Route> get(@PathVariable Long id) {
		return new ResponseEntity<Route>(routeRepository.findOne(id), HttpStatus.OK);
	}
	
	@RequestMapping
	public ResponseEntity<Iterable<Route>> getAll() {
		return new ResponseEntity<Iterable<Route>>(routeRepository.findAll(), HttpStatus.OK);
	}
	
}
