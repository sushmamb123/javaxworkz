package com.xworkz.song.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan("com.xworkz.song")
public class BeanConfiguration {
	public BeanConfiguration() {
		System.out.println("Created a BeanConfiguration..");
	}
	public ViewResolver viewResolver() {
		System.out.println("Invoking viewResolver()");
		ViewResolver resolver = new InternalResourceViewResolver("/",".jsp");
		return resolver;
		
			
			
	}

}
