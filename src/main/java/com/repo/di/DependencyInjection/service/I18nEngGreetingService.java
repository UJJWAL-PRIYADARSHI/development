package com.repo.di.DependencyInjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nGreetingService")
public class I18nEngGreetingService implements GreetingService{

	@Override
	public void display() {
		System.out.println("English : Hello World...");
		
	}

}
