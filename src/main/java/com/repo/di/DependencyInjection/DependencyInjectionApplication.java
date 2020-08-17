package com.repo.di.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import com.repo.di.DependencyInjection.controller.ContextController;
import com.repo.di.DependencyInjection.controller.I18nController;
import com.repo.di.DependencyInjection.controller.NSConstructorInjectionController;
import com.repo.di.DependencyInjection.controller.NSPropertyInjectionController;
import com.repo.di.DependencyInjection.controller.NSSetterInjectionController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		
		ContextController contextController = (ContextController)context.getBean("contextController");
		contextController.calling();
		
		NSPropertyInjectionController propertyController = (NSPropertyInjectionController)context.getBean("NSPropertyInjectionController");
		propertyController.calling();
		
		NSSetterInjectionController setterInjectionController = (NSSetterInjectionController) context.getBean("NSSetterInjectionController");
		setterInjectionController.calling();
		
		NSConstructorInjectionController constructorInjectionController = (NSConstructorInjectionController) context.getBean("NSConstructorInjectionController");
		constructorInjectionController.calling();
		
		I18nController i18nController = (I18nController) context.getBean("i18nController");
		i18nController.calling();
	}

}
