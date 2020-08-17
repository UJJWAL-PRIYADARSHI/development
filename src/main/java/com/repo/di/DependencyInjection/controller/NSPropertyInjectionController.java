package com.repo.di.DependencyInjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.repo.di.DependencyInjection.service.GreetingService;

@Controller
public class NSPropertyInjectionController {

	@Autowired
	GreetingService greetingService;
	
	public void calling() {
		greetingService.display();
	}
}
