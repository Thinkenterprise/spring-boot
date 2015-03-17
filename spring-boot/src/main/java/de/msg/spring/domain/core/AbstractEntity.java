package de.msg.spring.domain.core;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

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



@MappedSuperclass
public abstract class AbstractEntity {

	@Id
	@GeneratedValue
	private Long id;

	public AbstractEntity(Long id) {
		super();
		this.id = id;
	}

	public AbstractEntity() {
		super();
		
	}

	public Long getId() {
		return id;
	}
	
	
}
