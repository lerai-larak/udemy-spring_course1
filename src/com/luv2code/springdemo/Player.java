package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Player {
	
	@Value("${player.alias}") //read a value from a properties file
	private String alias;
	
	public Player() {
		System.out.println("Player: Inside constructor");
	}

	public void descibePlayer() {
		System.out.println("Player: This is a player in the team.");
	}

	@Override
	public String toString() {
		return "Player [alias= " + alias + "]";
	}
	
}
