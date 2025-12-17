package com.learn.springboot.demo.util;

import org.springframework.stereotype.Component;

@Component //using this annotations marks it as a bean and makes available for the injection
//@Primary //Can be used to make a class default dependency if no qualifier has been used, Qualifier has more priority than primary
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("Constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "CRICKET: Practice fast bowling for 15 minutes";
    }
}
