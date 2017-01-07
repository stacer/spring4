package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {
	
	public void add(){
		System.out.println("我是使用方法拦截的Service");
	}
	
}
