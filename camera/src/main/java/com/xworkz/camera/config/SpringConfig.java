package com.xworkz.camera.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.camera")
public class SpringConfig {
	public SpringConfig() {
		System.out.println("Created a SpringConfig...");
	}

}
