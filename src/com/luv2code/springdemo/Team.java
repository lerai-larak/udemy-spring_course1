package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Team {
	
	//using field injection for autowiring
	//no need for setter since Spring will use reflection to inject dependency
	@Autowired
	private Player player;
	
	private Integer teamId;

	public Integer getTeamId() {
		return teamId;
	}

	
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}


	public Player getPlayer() {
		return player;
	}

		
}
