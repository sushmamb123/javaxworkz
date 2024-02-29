package com.xworkz.saloon.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.saloon")
public class SpringConfig {
	public SpringConfig() {
		System.out.println("Creating a SpringConfig..");
	}
	

}
