package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve the bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//to test for implicit bean scope, check if the two coach instance are the same object
		boolean isSame = (theCoach == alphaCoach); 
		
		System.out.println("\nPointing to the same location: "+isSame);
		System.out.println("Memory location for "+theCoach.getClass().getName()+":\t"+theCoach);
		System.out.println("Memory location for "+alphaCoach.getClass().getName()+":\t"+alphaCoach);
		
		//close the context
		context.close();
	}

}
