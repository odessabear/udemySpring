package com.luv2code.springdemo;

public class GolfCoach implements Coach {
    private FortuneService fortuneService;

    public GolfCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }



    @Override
    public String getDailyWorkout() {
        return "Practice your putting skills for 2 hours today";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //add an init method
    public void doMyStartStuff(){
        System.out.println("GolfCoach: inside method  doMyStartStuff.Hey");
    }

    // add a destroy method
    public void doMyCleanupStuffYoYo(){
        System.out.println("GolfCoach: inside method doMyCleanupStuffWowWow");
    }
}
