//package com.luv2code.springdemo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component("sillyCoach")
//public class TennisCoach implements Coach {
//
//	private FortuneService fortuneService;
//	
//	public TennisCoach() {
//		System.out.println("Inside Tennis coach constructor");
//	}
//	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//		System.out.println("Inside autowired setter method");
//	}
//	
//	@Override
//	public String getDailyWorkout() {
//		return "Practice your backhand volley";
//	}
//
//	@Override
//	public String getDailyFortune() {
//		return fortuneService.getFortune();
//	}
//
//}
