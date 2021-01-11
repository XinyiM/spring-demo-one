package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private  String[] data = new String[]{
            "First Fortune",
            "Second Fortune",
            "Third Fortune"
    };
    private Random random = new Random();

    @Override
    public String getFortune() {
        return data[random.nextInt(data.length)];
    }
}
