package com.amritesh.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.amritesh.springdemo")
public class SportConfig {
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	@Scope("prototype")
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
}