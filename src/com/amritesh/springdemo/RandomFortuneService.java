package com.amritesh.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {
			"Luck 1", "Luck 2", "Luck 3", "Luck 4", "Luck 5"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		return fortunes[myRandom.nextInt(fortunes.length)];
	}

}