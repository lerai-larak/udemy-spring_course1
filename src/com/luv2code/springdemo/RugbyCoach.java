package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do some pushups";
	}

}
