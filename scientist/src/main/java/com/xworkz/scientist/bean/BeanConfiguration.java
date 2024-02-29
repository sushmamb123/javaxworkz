package com.xworkz.scientist.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan("com.xworkz.scientist")
public class BeanConfiguration {
	public BeanConfiguration() {
		System.out.println("Created a BeanConfiguration..");
	}
	public ViewResolver viewResolver() {
		ViewResolver resolver=new InternalResourceViewResolver("/",".jsp");
		return resolver;
		
	}
	

}
