package com.learn.springboot.demo.util;

import org.springframework.stereotype.Component;

@Component // Registers it as a bean and makes available for component scan for dependency injection
//@Lazy // This restricts it from being instantiated unless and until required
public class BaseBallCoach implements Coach{

    public BaseBallCoach() {
        System.out.println("Constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "BASEBALL: Spend 30 minutes in BaseBall practice";
    }
}
