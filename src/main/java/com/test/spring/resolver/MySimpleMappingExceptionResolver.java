package com.test.spring.resolver;

public class MySimpleMappingExceptionResolver {
	private String exceptionMappings;
	private String defaultErrorView;

	public void setExceptionMappings(String exceptionMappings) {
		this.exceptionMappings = exceptionMappings;
	}

	public void setDefaultErrorView(String defaultErrorView) {
		this.defaultErrorView = defaultErrorView;
	}
	
	
}
