package com.luv2code.annotations;

import com.luv2code.springdemo.FortuneService;


public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a sad day!";
    }
}
