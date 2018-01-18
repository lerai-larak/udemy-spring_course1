package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
	
		//read the spring config class named Sportconfig.java
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from the spring continer

		SwinCoach theCoach = context.getBean("swinCoach", SwinCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getTeamEmail()); //test injected value from properties file
		//close the context
		context.close();
	}

}
