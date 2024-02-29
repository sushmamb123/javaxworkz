package com.xworkz.order.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.order")
@EnableWebMvc
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("Created a SpringConfiguration..");
	}

}