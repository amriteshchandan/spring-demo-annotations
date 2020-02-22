package com.amritesh.springdemo.driverprograms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amritesh.springdemo.Coach;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		context.close();
	}

}