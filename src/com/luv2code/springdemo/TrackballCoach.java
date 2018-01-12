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
	
	//add an init method
	//Custom methods can be called when bean initialization is taking place,
	// the method's signature has to be public void, these methods are also called hooks 

	public void doSomeStartUpStuff() {
		System.out.println("TrackballCoach: Inside method startUp");
	}
	
	//add a destroy hook
	public void doSomeCleanUpStuff() {
		System.out.println("TrackballCoach: Inside method cleanUp");
	}
}
