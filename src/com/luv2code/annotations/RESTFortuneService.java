package com.luv2code.annotations;

import com.luv2code.springdemo.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Inside the REST Fortune Service!";
    }
}
