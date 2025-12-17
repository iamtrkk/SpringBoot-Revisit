package com.learn.springboot.demo.util;

//We will not annotate it with @Component instead we will use configuration file
// to create a bean and inject it.
public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "SwimCoach: Inside Swim Coach";
    }
}
