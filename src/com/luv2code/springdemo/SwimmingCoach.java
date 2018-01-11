package com.luv2code.springdemo;

public class SwimmingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Swim for 12 hours straight";
	}

	@Override
	public String getDailyFortune() {
		return "";
	}

}
