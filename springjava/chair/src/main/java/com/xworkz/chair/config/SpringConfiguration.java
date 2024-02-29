package com.xworkz.chair.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
@ComponentScan("com.xworkz.chair")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("Created SpringConfiguration");
	}
	public ViewResolver reViewResolver() {
		ViewResolver resolver=new InternalResourceViewResolver("/",".jsp");
		return resolver;
	}

}
