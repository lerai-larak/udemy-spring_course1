package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from Spring container
		CricketCoach theCoach = context.getBean("cricketCoach",CricketCoach.class);
		Coach raceCoach = context.getBean("racingCoach",RacingCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeamName());
		
		System.out.println("Racing coach: " + raceCoach.getDailyWorkout());
		//close the context
		context.close();
		

	}

}
