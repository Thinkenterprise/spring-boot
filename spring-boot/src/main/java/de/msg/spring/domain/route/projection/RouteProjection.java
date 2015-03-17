package de.msg.spring.domain.route.projection;

import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.stereotype.Service;

import de.msg.spring.domain.route.Flight;
import de.msg.spring.domain.route.Route;


@Projection(name = "route", types = { Route.class} )
public interface RouteProjection {

	public Long getId();
	public String getNumber();
	
		
	@Value("#{@routeService.calculateTotal()}")
	public Double getTotal();
	
	
	public Set<FlightProjection> getFlights() ;
	
	@Projection(types = Flight.class)
	public interface FlightProjection {
		
		public double getPrice();
		
	}
	
}
