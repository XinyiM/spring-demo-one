package com.luv2code.annotations;

import com.luv2code.springdemo.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Inside Database Fortune Service!";
    }
}
