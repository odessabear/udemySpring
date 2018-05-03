package com.luv2code.springdemo;

public class GolfCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "I am the new GolfCoach";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
