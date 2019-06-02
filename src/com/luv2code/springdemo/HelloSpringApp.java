package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//lo    ad the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from Spring container
		Coach trackCoach = context.getBean("myCoach",Coach.class);
		
		//call methods on the bean
		
		System.out.println("Racing coach: " + trackCoach.getDailyWorkout());
		System.out.println("Racing coach: " + trackCoach.getDailyFortune());
		
		//close the context
		context.close();
		

	}

}
