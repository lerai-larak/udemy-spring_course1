package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Player {
	
	public Player() {
		System.out.println("Player: Inside constructor");
		setId(435);
	}

	private Integer id = Integer.getInteger(String.valueOf(Math.random()));;
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
		this.id = Integer.getInteger(String.valueOf(Math.random() * id));
	}



	public void descibePlayer() {
		System.out.println("Player: This is a player in the team.");
	}



	@Override
	public String toString() {
		return "Player [id=" + id + "]";
	}
	
}
