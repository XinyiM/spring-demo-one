package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

    // Define a private field for the dependency
    private FortuneService fortuneService;

    // Define a constructor for dependency injection
    public BaseballCoach(FortuneService thefortuneService){
        fortuneService = thefortuneService;
    }
    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice.";
    }

    @Override
    public String getDailyFortune() {
        // use my fortune Service to get a fortune
        return fortuneService.getFortune();
    }
}
