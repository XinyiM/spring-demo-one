package com.luv2code.annotations;

import com.luv2code.springdemo.Coach;
import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice Golf!!!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
