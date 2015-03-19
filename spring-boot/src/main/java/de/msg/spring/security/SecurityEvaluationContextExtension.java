package de.msg.spring.security;
import java.util.Map;

import org.springframework.data.repository.query.spi.EvaluationContextExtension;
import org.springframework.data.repository.query.spi.Function;
import org.springframework.security.access.expression.SecurityExpressionRoot;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

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


public class SecurityEvaluationContextExtension implements
		EvaluationContextExtension {
	@Override
	  public String getExtensionId() {
	    return "security";
	  }

	  @Override
	  public SecurityExpressionRoot getRootObject() {
	    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	    return new SecurityExpressionRoot(authentication) {};
	  }

	@Override
	public Map<String, Object> getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Function> getFunctions() {
		// TODO Auto-generated method stub
		return null;
	}

}
