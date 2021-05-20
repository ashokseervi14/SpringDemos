package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService theFortuneService;

//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		this.theFortuneService = theFortuneService;
//	}

	public TennisCoach() {
		System.out.println("TennisCoach:inside default constructor");
	}

	// define setter method
//	@Autowired
//	 public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println("TennisCoach : Setter Injection");
//		 this.theFortuneService = theFortuneService;
//	 }

	@Override
	public String getDailyWorkout() {

		return "Practice as Tennis Coach INstructions";
	}

	public String getDailyFortune() {
		return theFortuneService.getFortune();
	}
}
