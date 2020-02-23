package com.amritesh.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
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
	
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("[TennisCoach] doMyStartUpStuff");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("[TennisCoach] doMyCleanUpStuff");
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