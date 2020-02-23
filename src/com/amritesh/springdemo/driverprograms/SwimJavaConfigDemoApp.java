package com.amritesh.springdemo.driverprograms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amritesh.springdemo.Coach;
import com.amritesh.springdemo.SportConfig;
import com.amritesh.springdemo.SwimCoach;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		System.out.println("[SwimJavaConfigDemoApp] main");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		SwimCoach coach1 = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		context.close();
	}

}