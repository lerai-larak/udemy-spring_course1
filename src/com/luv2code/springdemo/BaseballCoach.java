package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for injection
	private FortuneService fortuneService;
	
	//define a constructor for deppendency injection
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return  "Spend 30 minutes in Batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
