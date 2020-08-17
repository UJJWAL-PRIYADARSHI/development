package com.repo.di.DependencyInjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nGreetingService")
public class I18nSpanishGreetingService implements GreetingService{
	
	@Override
	public void display() {
		System.out.println("Spanish : Hola Munda...");
			
	}

}
