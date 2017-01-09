package com.wisely.highlight_spring4.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.prepost")
public class PrePostConfig {
	
	@Bean(initMethod="init",destroyMethod="destory")
	protected BeanWayService beanWayService() {
		return new BeanWayService();
	}
	
	@Bean
	protected JSR250WayService jsrWayService(){
		return new JSR250WayService();
	}
}
