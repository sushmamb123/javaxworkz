package com.xworkz.tourism.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.tourism")
@EnableWebMvc
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("Created a SpringConfiguration..");
	}

}
