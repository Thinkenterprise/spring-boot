package de.msg.spring.domain.route.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

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


public class RouteRepositoryImpl implements RouteRepositoryJpa {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Route> findAllJpa() {
		
		TypedQuery<Route> query = entityManager.createQuery("select r from Route r", Route.class);
		
		return query.getResultList();
	}

}
