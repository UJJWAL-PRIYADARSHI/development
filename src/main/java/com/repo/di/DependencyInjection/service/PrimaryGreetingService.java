package com.repo.di.DependencyInjection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

	@Override
	public void display() {
		System.out.println("Primary : Hello world");
		
	}

}
