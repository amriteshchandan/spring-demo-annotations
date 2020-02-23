package com.amritesh.springdemo.driverprograms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amritesh.springdemo.Coach;
import com.amritesh.springdemo.SportConfig;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		System.out.println("[JavaConfigDemoApp] main");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		context.close();
	}

}