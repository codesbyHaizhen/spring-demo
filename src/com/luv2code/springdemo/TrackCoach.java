package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
		
	// define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
		
	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get a fortune
		return "Just do it, " + fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		return "run a hard 5k";
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	//add an destory method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
	
}
