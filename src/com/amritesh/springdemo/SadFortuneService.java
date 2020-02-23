package com.amritesh.springdemo;

public class SadFortuneService implements FortuneService {
	
	SadFortuneService() {
		System.out.println("[SadFortuneService] no-arg constructor");
	}

	@Override
	public String getFortune() {
		return "Whole world is a lie.";
	}

}