package com.amritesh.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	@Value("${email}")
	private String emailAddress;
	@Value("${team}")
	private String team;
	
	TennisCoach() {
		System.out.println("[TennisCoach] no-arg constructor");
	}
	
	@Autowired
	TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		System.out.println("[TennisCoach] parameterized constructor");
		this.fortuneService = fortuneService;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}