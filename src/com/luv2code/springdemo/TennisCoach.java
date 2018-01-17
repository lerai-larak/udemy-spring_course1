package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
//@Scope("prototype") //create a new instance every time
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	private Player favoritePlayer;
	
	public TennisCoach() {
		System.out.println("Inside Tennis coach constructor");
	}
	
	//method will execute after constructor and after injection of dependencies
	@PostConstruct
	public void doSomeInitMethod() {
		System.out.println("Called the @postconstruct method");
	}
	
	//method will execute before bean is destroyed
	@PreDestroy
	public void doSomeDestroyMethod() {
		System.out.println("Called the @predestroy method");
	}
	
	@Autowired
	@Qualifier("dbFortuneTeller") //use a qualifier to specify a specific bean implementation to be injected 
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Inside autowired setter method");
	}
	
	@Autowired
	public void setPlayer(Player player) {
		this.favoritePlayer = player;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getFavoritePlayer() {
		return favoritePlayer.toString();
	}

}
