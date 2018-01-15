package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
	
		//read the spring config file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from the spring continer
		Coach thatSillyCoach = context.getBean("sillyCoach",Coach.class);
		
		//using default bean name issued by container (if not defined in bean component annotation)
		Coach rugCoach = context.getBean("rugbyCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(thatSillyCoach.getDailyWorkout());
		System.out.println(rugCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
