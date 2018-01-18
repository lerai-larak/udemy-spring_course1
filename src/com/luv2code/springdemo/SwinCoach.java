package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwinCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${team.email}")
	private String teamEmail;
	
	public SwinCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 metres as a warmup";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getFavoritePlayer() {
		return null;
	}

	public String getTeamEmail() {
		return teamEmail;
	}
	
	

}
