package com.repo.di.DependencyInjection.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService{
	
	@Override
	public void display() {
		System.out.println("ConstructorInjected Hello World...");
		
	}
}
