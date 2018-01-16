package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//use an array of strings
	
	private String[] data = {
			"Beware of the Wolf in Sheep skin",
			"Dilligence is the mother of good luck",
			"The Journey is the reward"
	};

	private Random randomNum = new Random();

	@Override
	public String getFortune() {
		//pick a random string from the array
		int index = randomNum.nextInt(data.length); 
		return data[index];
	}

}
