package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;

	public CricketCoach() {
		System.out.println("CricketCoach: inside the no-arg constructor");
	}

	public String getEmailAddress() {
		
		return emailAddress;
		
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setEmailAddress method");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach:inside setTeam  method");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside the setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Ask for balling and batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		return "Cricket Coach Fortune:" + fortuneService.getFortune();
	}

}
