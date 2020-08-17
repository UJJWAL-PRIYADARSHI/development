package com.repo.di.DependencyInjection.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

	@Override
	public void display() {
		System.out.println("Hello World...");
		
	}

}
