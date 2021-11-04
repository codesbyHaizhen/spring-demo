package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;

	private FortuneService fortuneService;
	
	public CricketCoach() {
		
	}
	
	// setter methods for setter injection values from a properties file
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	// setter method for setter injection
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		
		return "practice exercises 30 times";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
