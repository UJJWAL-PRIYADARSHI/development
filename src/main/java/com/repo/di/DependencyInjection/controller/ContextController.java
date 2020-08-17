package com.repo.di.DependencyInjection.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ContextController {
	
	public void sayHello() {
		System.out.println("ContextController...");
	}
}
