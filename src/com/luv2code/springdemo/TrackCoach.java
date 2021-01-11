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
}
