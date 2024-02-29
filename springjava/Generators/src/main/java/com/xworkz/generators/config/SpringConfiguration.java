package com.xworkz.generators.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan("com.xworkz.generators")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("Created in SpringConfiguration");
	}
	public ViewResolver reViewResolver() {
		ViewResolver resolver=new InternalResourceViewResolver("/",".jsp");
		return resolver;
	}

}
