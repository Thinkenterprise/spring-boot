package de.msg.spring;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import de.msg.spring.sample.HelloWorldService;

/*
 **  Spring Projections Samples 
 **  Design and Development by msg Applied Technology Research
 **  Copyright (c) 2014 msg systems ag (http://www.msg-systems.com/)
 **  All Rights Reserved.
 */


/**
 * 
 * @author Michael Schäfer
 * 
 * */
@Controller
public class Application {
	
	private static Log logger = LogFactory.getLog(Application.class);
	
	
	@Autowired
	private HelloWorldService helloWorldService;
	
	@Value("${helloWorld}")
	private String helloWorld;
	
	
	
	
	
	@RequestMapping(value="helloWorld")
	public @ResponseBody String helloWorld() {
		logger.debug("helloWorld");
		return helloWorldService.getHelloWorld();
		
	}
	
	@RequestMapping(value="helloWorldProperties")
	public @ResponseBody String helloWorldProperties() {
		return helloWorld;
		
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class, args);
	}
	
	@PostConstruct
	public void initialize() {
		SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken("system", "system", AuthorityUtils.createAuthorityList("ROLE_ADMIN")));
		
	}
	
	
	
	
}
