package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	/**
	 * 声明当前方法返回的是一个Bean
	 * @return
	 */
	@Bean
	public FunctionService functionService(){
		return new FunctionService();
	}
	
	
	@Bean
	public UseFunctionService useFunctionService(){
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}
	
}
