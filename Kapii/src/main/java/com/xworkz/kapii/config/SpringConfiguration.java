package com.xworkz.kapii.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.kapii")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("Created a spring configuration with no arg const...");
	}
	

}
