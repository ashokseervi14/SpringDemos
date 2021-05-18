package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	
	//define a private field
		 private FortuneService fortuneService;
		 
		 //define a constructor for Dependency Injection
		 
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	public TrackCoach(FortuneService fortuneService) {
			
			this.fortuneService = fortuneService;
		}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	//add a init method
	
	public void doMyStartupStuff() {
		System.out.println("Do my startup works");
	}
	
	//add a destroy method
	
	public void doMyCleanupStuff() {
		System.out.println("Do my Clean up stuff");
	}

}

