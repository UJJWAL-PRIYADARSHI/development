package com.repo.di.DependencyInjection.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{
	@Override
	public void display() {
		System.out.println("SetterInjected Hello World...");
		
	}
}
