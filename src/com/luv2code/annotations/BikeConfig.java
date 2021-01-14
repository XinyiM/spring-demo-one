package com.luv2code.annotations;

import com.luv2code.springdemo.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BikeConfig {

    @Bean
    public NewFortuneService newFortuneService(){
        return new NewFortuneService();
    }

    @Bean
    public Coach bikeCoach(){
        return new BikeCoach(newFortuneService());
    }
}
