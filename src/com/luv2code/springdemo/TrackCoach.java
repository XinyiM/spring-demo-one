package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    public TrackCoach(){}

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void doMyStartup(){
        System.out.println("TrackCoach: Inside custom startup method.");
    }

    public void doMyDestroy(){
        System.out.println("TrackCoach: Inside custom destroy method.");
    }
}
