package com.luv2code.annotations;

import com.luv2code.springdemo.FortuneService;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

@Component
public class FileFortuneService implements FortuneService {

    private String filePath = "/Users/maxinyi/Documents/Udemy/SpringHibernate/spring-demo-one/src/com/luv2code/annotations/fortune-data.txt";
    private List<String> services;
    private Random random = new Random();

    public FileFortuneService(){

        File fileReader = new File(filePath);
        System.out.println("Reading fortune data from file...");
        System.out.println("File path: " + filePath);
        services = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(
                new FileReader(fileReader))){
            String tempLine;
            while((tempLine = br.readLine()) != null){
                services.add(tempLine);
            }
        } catch (IOException e){
            e.fillInStackTrace();
        }
    }
    @Override
    public String getFortune() {
        int index = random.nextInt(services.size());
        return services.get(index);
    }
}
