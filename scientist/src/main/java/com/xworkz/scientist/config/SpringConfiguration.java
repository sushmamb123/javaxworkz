package com.xworkz.scientist.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.scientist")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("Created a SpringConfiguration..");	
		}

}
