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
	//this method wil be called by spring in the bean init lifecycle stage 
	public void doStartupStuff() {
		System.out.println("Doing some startup things...");
	}
	
	//add a destroy method -- called by spring when destrying bean/context
	public void doCleanupStuff() {
		System.out.println("Doing some clean up things...");
	}

}
