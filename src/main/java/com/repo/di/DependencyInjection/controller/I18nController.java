package com.repo.di.DependencyInjection.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.repo.di.DependencyInjection.service.GreetingService;

@Controller
public class I18nController {
	
	GreetingService greetingService;
	
	I18nController(@Qualifier("i18nGreetingService")GreetingService greetingService){
		this.greetingService = greetingService;
	}
	
	public void calling() {
		greetingService.display();
	}
}
