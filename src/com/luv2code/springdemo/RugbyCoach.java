package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("rugbyCoach")
public class RugbyCoach implements Coach {

	
	private FortuneService fortuneService;
	private Team team;
	
	public RugbyCoach() {
		System.out.println("Inside rugbycoach constructor");
		}
//	
//	
//	public RugbyCoach(FortuneService fortuneService) {
//		
//	}
	
	//Any method can be used for dependency injection
	@Autowired
	public void assignTeam(Team team) {
		this.team = team;
	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("RugbyCoach: Inside autowired setter method");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do some pushups";
	}

	@Override
	public String getDailyFortune() {
			return fortuneService.getFortune();
	}
	
	public String getPlayers() {
		return team.getPlayer().toString();
	}
	

}
 