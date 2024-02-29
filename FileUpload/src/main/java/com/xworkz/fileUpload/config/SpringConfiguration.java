package com.xworkz.fileUpload.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan("com.xworkz.fileUpload")
@EnableWebMvc
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("Created a SpringConfiguration");
	}
	@Bean
    public MultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("invoking the viewResolver");
		ViewResolver resolver=new InternalResourceViewResolver("/",".jsp");
		return resolver;
		
	}
	

}
