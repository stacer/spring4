package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
//		FunctionService functionService = context.getBean(FunctionService.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello("依赖注入"));
		//容器关闭
		context.close();
	}
}
