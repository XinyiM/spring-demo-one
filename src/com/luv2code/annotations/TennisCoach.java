package com.luv2code.annotations;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired // Field Injection
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    /*
    // Spring will scan for a component that implements the fortuneService interface.
    @Autowired
    public  TennisCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }*/

    // Define a default constructor
    public TennisCoach(){
        System.out.println(">> TennisCoach : inside default constructor");
    }

    //Define a setter method
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService theFortuneService){
//        System.out.println(">> TennisCoach : inside doSomeCrazyStuff() method!");
//        fortuneService = theFortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your back hand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
