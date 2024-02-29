package com.xworkz.validation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.validation")
public class BeanConfiguration {
	public BeanConfiguration() {
		System.out.println("Created a BeanConfiguration..");
	}

	@Bean
	public ViewResolver viewResolver() {
		ViewResolver resolver = new InternalResourceViewResolver("/",".jsp");

		return resolver;
	}

}
