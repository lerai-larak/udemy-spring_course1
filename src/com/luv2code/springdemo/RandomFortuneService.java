package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {

	private String[] quotesCollection;
	
	public  RandomFortuneService() {
		quotesCollection = new String[]  
				{"You will win bigly",
				 "You still aint won enough yet!",
				 "That's the Spirit man",
				 "Way to Go Bro"
				 };
			
	}
	
	@Override
	public String getFortune() {
		return (quotesCollection[(int) (Math.random()*4)]);
	}

}
