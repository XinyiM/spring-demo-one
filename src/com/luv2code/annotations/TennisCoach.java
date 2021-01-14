package com.luv2code.annotations;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
    }


    /*
    // Spring will scan for a component that implements the fortuneService interface.
    @Autowired
    public  TennisCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }*/

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
