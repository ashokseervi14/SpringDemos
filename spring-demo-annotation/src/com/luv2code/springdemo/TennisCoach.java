package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("theSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice as Tennis Coach INstructions" ;
	}

}
