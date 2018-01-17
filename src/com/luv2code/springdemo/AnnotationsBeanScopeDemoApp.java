package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach anotherCoach = context.getBean("tennisCoach",Coach.class);

		//check if bean are the same..default scope of objects is Singleton
		boolean isSimilar = (theCoach == anotherCoach);
		//print some analysis
		System.out.println("\nPointing to the same object: " + isSimilar);
		System.out.println("\nMemory location for theCoach: "  + theCoach);
		System.out.println("\nMemory location for anotherCoach: " + anotherCoach + "\n");
		
		//close the context
		context.close();
	}

}
