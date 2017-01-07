package com.wisely.highlight_spring4.ch1.javaconfig;

public class UseFunctionService {
	
	FunctionService functionService;
	
	//此处不使用属性注入的方式,使用set方法注入
	public void setFunctionService(FunctionService functionService){
		this.functionService = functionService;
	}
	
	public String sayHello(String world){
		return this.functionService.sayHello(world);
	}
	
}
