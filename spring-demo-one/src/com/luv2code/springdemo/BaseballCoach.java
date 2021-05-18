package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field
	 private FortuneService fortuneService;
	 
	 //define a constructor for Dependency Injection
	 public BaseballCoach(FortuneService theFortuneService) {
		 fortuneService = theFortuneService;
	 }
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minute in batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}







