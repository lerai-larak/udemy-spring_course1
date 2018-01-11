package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fs;
	private String emailAddress;
	private String teamName;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		
		this.teamName = teamName;
		System.out.println("Set team name to: " + this.teamName);
	}

	public void setFortuneService(FortuneService fortuneService) {
		fs = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Bat for 5 hours straight";
	}

	@Override
	public String getDailyFortune() {
		return fs.getFortune();
	}

}
