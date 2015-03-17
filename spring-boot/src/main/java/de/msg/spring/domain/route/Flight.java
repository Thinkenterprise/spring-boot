package de.msg.spring.domain.route;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.Max;

import de.msg.spring.domain.core.AbstractEntity;

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
@Entity
public class Flight extends AbstractEntity {

	//@Max(value=200)
	private double price;
	private Date time;
	
	public Flight() {
		super();
	}
	
	public Flight(double price, Date time) {
		super();
		this.price = price;
		this.time = time;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}
