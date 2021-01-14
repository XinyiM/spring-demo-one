package com.luv2code.annotations;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

public class BikeCoach implements Coach {
    private FortuneService fortuneService;

    public BikeCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Do bicycle practice!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
