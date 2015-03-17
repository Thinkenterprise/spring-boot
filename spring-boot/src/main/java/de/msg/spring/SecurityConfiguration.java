package de.msg.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
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

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		
		
		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN").
		                              and().withUser("user").password("user").roles("USER");
			
	}
	
	
	@Override
	  protected void configure(HttpSecurity http) throws Exception {

	    http
	      .httpBasic().and().authorizeRequests().antMatchers(HttpMethod.POST, "/routes/**").
	      hasRole("ADMIN").antMatchers(HttpMethod.GET, "/routes/**").hasRole("ADMIN").and().csrf().disable();
	  }
	
	
}
