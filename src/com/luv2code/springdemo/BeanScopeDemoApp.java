package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load the config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve beans from the container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same
        boolean res = (theCoach == alphaCoach);
        System.out.println("The Result:" + res);
        System.out.println("Memory Location for theCoach:" + theCoach);
        System.out.println("Memory Location for alphaCoach:" + alphaCoach);

        // close the context
        context.close();

    }
}
