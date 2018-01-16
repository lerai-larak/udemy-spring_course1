package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("dbFortuneTeller") // an explicitly named bean
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "DatabaseFortuneService";
	}

}
