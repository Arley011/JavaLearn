package com.luv2code.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService=fortuneService;
    }

    public TrackCoach() {}

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: "+fortuneService.getFortune();
    }

    // add an init method
    public void doInit(){
        System.out.println("TrackCoach: inside method doInit");
    }

    // add a destroy method
    public void doDestroy(){
        System.out.println("TrackCoach: inside method doDestroy");
    }

}
