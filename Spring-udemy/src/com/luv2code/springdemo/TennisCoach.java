package com.luv2code.springdemo;

public class TennisCoach implements Coach {

    private FortuneService fortuneService;
    //add new fields for emailAddress and team
    private String team;
    private String emailAddress;
    @Override
    public String getDailyWorkout() {
        return "Hit the ball at the wall for 15 min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public TennisCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
    public TennisCoach(){
        System.out.println("TennisCoach: inside no-arg constructor");
     }
    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TennisCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public void setTeam(String team) {
        System.out.println("TennisCoach: inside setter method - setTeam");
        this.team = team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("TennisCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void doInit(){
        System.out.println("TennisCoach: inside the init-method");
    }

    public void doDestroy(){
        System.out.println("TennisCoach: inside the destroy-method");
    }
}
