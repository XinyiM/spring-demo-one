package com.luv2code.annotations;

import com.luv2code.springdemo.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    private  String[] data = new String[]{
            "First Fortune",
            "Second Fortune",
            "Third Fortune",
            "Fourth Fortune"
    };
    private Random random = new Random();

    @Override
    public String getFortune() {
        return data[random.nextInt(data.length)];
    }
}
