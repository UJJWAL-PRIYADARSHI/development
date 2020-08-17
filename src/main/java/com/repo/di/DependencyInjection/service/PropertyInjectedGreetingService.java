package com.repo.di.DependencyInjection.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{

	@Override
	public void display() {
		System.out.println("ProertyInjected Hello World...");
		
	}
	
}
