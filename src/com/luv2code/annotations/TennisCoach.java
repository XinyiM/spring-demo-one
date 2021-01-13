package com.luv2code.annotations;

import com.luv2code.springdemo.Coach;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your back hand volley";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
