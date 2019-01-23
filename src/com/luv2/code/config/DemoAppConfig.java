package com.luv2.code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * THis class will use to configure Spring using java
 * @author Khuram Shah
 *
 */
@Configuration //replace web.xml
@EnableWebMvc //replace spring-mvc-demo-servlet.xml 
//@ComponentScan(basePackages = "com")
@ComponentScan({"com.srpingdemo.mvc","com.luv2.code"})
public class DemoAppConfig {
 
	//Define Spring MVC view resolver for ref spring-mvc-demo-servlet.xml
	//below code was for Spring web mvc
	@Bean
	public ViewResolver internalResourceViewResolver() {
	    InternalResourceViewResolver bean = new InternalResourceViewResolver();
	    bean.setViewClass(JstlView.class);
	    bean.setPrefix("/WEB-INF/view/");
	    bean.setSuffix(".jsp");
	    return bean;
	}

//	//Define Spring view resolver
//	@Bean
//	public ViewResolver viewResolver(){
//	InternalResourceViewResolver bean = new InternalResourceViewResolver();
//	bean.setPrefix("/WEB-INF/view/");
//	bean.setSuffix(".jsp");
//	return bean;
//	}
}
