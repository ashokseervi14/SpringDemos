package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService theFortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice as Tennis Coach INstructions" ;
	}
    
	public String getDailyFortune() {
		return theFortuneService.getFortune();
	}
}
