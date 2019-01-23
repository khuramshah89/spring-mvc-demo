package com.luv2.code.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringDispatcherervletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	// Step 1: Configure Spring MVC Dispatcher Servlet -->
		return new Class[]{DemoAppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		//Step 2: Set up URL mapping for Spring MVC Dispatcher Servlet -->
		return new String [] {"/"};
	}

}
