package com.xworkz.movie;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
	public SpringWebConfig() {
		System.out.println("creating a SpringWebConfig");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running a getRootConfigClasses");

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running a getServletConfigClasses");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
	System.out.println("Running a getServletMappings");
		return null;
	}

}
