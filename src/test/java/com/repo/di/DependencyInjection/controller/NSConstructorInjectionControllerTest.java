package com.repo.di.DependencyInjection.controller;

import org.junit.Before;
import org.junit.Test;

import com.repo.di.DependencyInjection.service.GreetingServiceImpl;

public class NSConstructorInjectionControllerTest {

	NSConstructorInjectionController controller;
	
	@Before
	public void setup() {
		controller = new NSConstructorInjectionController(new GreetingServiceImpl());
	}
	
	@Test
	public void greetingServiceTest() {
		controller.calling();
	}

}
