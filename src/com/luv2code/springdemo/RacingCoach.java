package com.luv2code.springdemo;

public class RacingCoach  implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Race for 2hrs";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
