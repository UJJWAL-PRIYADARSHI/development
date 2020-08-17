package com.repo.di.DependencyInjection.controller;

import org.junit.Before;
import org.junit.Test;

import com.repo.di.DependencyInjection.service.GreetingServiceImpl;

public class NSSetterInjectionControllerTest {

	NSSetterInjectionController controller;
	
	@Before
	public void setUp() throws Exception {
		controller = new NSSetterInjectionController();
		controller.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void greetingService() {
		controller.calling();
	}

}
