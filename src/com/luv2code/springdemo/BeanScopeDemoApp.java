package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifecycle-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach anotherCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same bean
		boolean result = (theCoach == anotherCoach);
		System.out.println("Beans are same object? " + result);
		
		System.out.println("Memory location for theCoach-->" + theCoach + "\nMemory location for anotherCoach--> " + anotherCoach);
		
		//closae the context
		context.close();
	}

}
