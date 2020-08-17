package com.repo.di.DependencyInjection.controller;

import org.junit.Before;
import org.junit.Test;

import com.repo.di.DependencyInjection.service.GreetingServiceImpl;

public class NSPropertyInjectionControllerTest {

	NSPropertyInjectionController controller;
	
	@Before
	public void setUp() throws Exception {
		controller = new NSPropertyInjectionController();
		controller.greetingService = new GreetingServiceImpl();
	}

	@Test
	public void greetingService() {
		controller.calling();
	}

}
