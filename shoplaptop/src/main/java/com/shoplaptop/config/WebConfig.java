package com.shoplaptop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("static/img/**").addResourceLocations("/static/images/");
		registry.addResourceHandler("static/css/**").addResourceLocations("/static/css/");
		registry.addResourceHandler("static/js/**").addResourceLocations("/static/js/");
		registry.addResourceHandler("static/Frontend/img/**").addResourceLocations("/static/Frontend/images/");
		registry.addResourceHandler("static/Frontend/css/**").addResourceLocations("/static/Frontend/css/");
		registry.addResourceHandler("static/Frontend/js/**").addResourceLocations("/static/Frontend/js/");
	}
}
