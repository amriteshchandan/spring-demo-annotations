package com.amritesh.springdemo.driverprograms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amritesh.springdemo.Coach;

public class AnnotationsBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach1 = context.getBean("tennisCoach", Coach.class);
		Coach coach2 = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach1);
		System.out.println(coach2);
		System.out.println("Pointing to same object :: " + (coach1 == coach2));
		context.close();
		
		
	}

}