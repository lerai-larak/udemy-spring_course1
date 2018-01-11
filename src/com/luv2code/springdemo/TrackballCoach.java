package com.luv2code.springdemo;

public class TrackballCoach implements Coach {
	
	private FortuneService fs;
	
	

	public TrackballCoach() {
		super();
	}

	public TrackballCoach(FortuneService fs) {
		super();
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		return "Run for 15 kilometers";
	}

	@Override
	public String getDailyFortune() {
		return fs.getFortune();
	}

}
