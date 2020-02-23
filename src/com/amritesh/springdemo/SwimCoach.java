package com.amritesh.springdemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
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

}