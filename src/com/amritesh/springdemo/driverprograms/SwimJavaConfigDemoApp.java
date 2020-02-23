package com.amritesh.springdemo.driverprograms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amritesh.springdemo.Coach;
import com.amritesh.springdemo.SportConfig;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		System.out.println("[SwimJavaConfigDemoApp] main");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach = context.getBean("swimCoach", Coach.class);
		Coach coach1 = context.getBean("swimCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		context.close();
	}

}