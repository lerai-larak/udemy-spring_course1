package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//this make the class a configuration file
@Configuration
//@ComponentScan("com.luv2code.springdemo") beans have been manually defined

@PropertySource("classpath:values.properties") //read a properties file
public class SportConfig {

	//define a method to expose the beans for sad fortune service,swimcoach and inject dependencies
	//the method name will be used as the bean id.
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swinCoach() {
		return new SwinCoach(sadFortuneService()); //injects a bean reference
	}
	
	
}
