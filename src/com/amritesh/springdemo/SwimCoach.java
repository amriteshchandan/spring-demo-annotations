package com.amritesh.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${email}")
	private String email;

	@Value("${team}")
	private String team;
	
	SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000M for warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}