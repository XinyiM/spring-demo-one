package com.luv2code.annotations;


import com.luv2code.springdemo.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BikeConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BikeConfig.class);

        BikeCoach bikeCoach = context.getBean("bikeCoach", BikeCoach.class);

        System.out.println(bikeCoach.getDailyFortune());

        System.out.println(bikeCoach.getDailyWorkout());

        context.close();
    }
}
