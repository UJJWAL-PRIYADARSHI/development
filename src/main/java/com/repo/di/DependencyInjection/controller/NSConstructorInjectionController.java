package com.repo.di.DependencyInjection.controller;

import org.springframework.stereotype.Controller;

import com.repo.di.DependencyInjection.service.GreetingService;

@Controller
public class NSConstructorInjectionController {
	
	GreetingService greetingService;
	
	NSConstructorInjectionController(GreetingService greetingService){
		this.greetingService = greetingService;
	}

	public void calling() {
		greetingService.display();
	}
}
