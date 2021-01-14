package com.luv2code.annotations;

import com.luv2code.springdemo.FortuneService;

public class NewFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Return a New Fortune";
    }
}
