package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		
	}
	
	// setter method for setter injection
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
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
