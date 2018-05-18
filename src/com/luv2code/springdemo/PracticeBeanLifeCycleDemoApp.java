package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeBeanLifeCycleDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("PracticeBeanLifeCycle-applicationContext.xml");

        // retrieve bean from spring container

        Coach theCoach = context.getBean("myGolfCoach",Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();
    }
}
