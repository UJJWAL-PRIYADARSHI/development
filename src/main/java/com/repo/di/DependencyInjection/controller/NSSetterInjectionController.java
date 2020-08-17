package com.repo.di.DependencyInjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.repo.di.DependencyInjection.service.GreetingService;

@Controller
public class NSSetterInjectionController {
	
	GreetingService greetingService;
	
	@Qualifier("setterInjectedGreetingService")
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public void calling() {
		greetingService.display();
	}
}
