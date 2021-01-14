package com.luv2code.annotations;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;
import org.springframework.beans.factory.annotation.Value;


public class SwimCoach implements Coach {
    String getEmail() {
        return email;
    }

    String getTeam() {
        return team;
    }

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    private FortuneService fortuneService;
    SwimCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Do Swim Practice!!";
    }
}

