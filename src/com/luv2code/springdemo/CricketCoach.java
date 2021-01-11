package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    // add fields for emailAddress and Team
    private String emailAddress;
    private String team;


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: set EmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: set Team");
        this.team = team;
    }

    // create a no-arg constructor
    public CricketCoach(){
        System.out.println("CricketCoach: no-arg Constructor");
    }

    // Step1: create the setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: set Fortune Service");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes a day!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
