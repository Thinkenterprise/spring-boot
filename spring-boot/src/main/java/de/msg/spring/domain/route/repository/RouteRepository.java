package de.msg.spring.domain.route.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import de.msg.spring.domain.route.Route;
import de.msg.spring.domain.route.projection.RouteProjection;

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


@PreAuthorize("hasRole('ROLE_ADMIN')")
@RepositoryRestResource(excerptProjection = RouteProjection.class)
public interface RouteRepository extends CrudRepository<Route, Long>, RouteRepositoryJpa {

	public Iterable<Route> findByDestination(@Param("destination") String destination);
	
	@Query("select r from Route r where r.destination = :destination")
	public Iterable<Route> findByDestinationWithQuery(@Param("destination") String destination); 
	
	@EntityGraph("routeFlight")
	public Page<Route> findAll(Pageable request);
	
	
	 
}
