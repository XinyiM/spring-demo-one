package com.luv2code.annotations;

import com.luv2code.springdemo.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your bad day!'";
    }
}
