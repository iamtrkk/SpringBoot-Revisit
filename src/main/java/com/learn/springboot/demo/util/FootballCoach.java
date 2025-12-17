package com.learn.springboot.demo.util;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Creates new instance everytime overrides default singleton pattern
// where a instance is cached and referenced where requeried instead of creating new bean every time
public class FootballCoach implements Coach {

    public FootballCoach() {
        System.out.println("Constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "FOOTBALL: Do 15 minutes sprint daily";
    }

//    Bean life cycle methods which instantiation and before the beans gets destroyed
//    Automatically runs while instantiating the bean can call utility methods here like DB connect logger etc.
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartUpStuff(): " + getClass().getSimpleName());
    }

//    Get called automatically just before bean gets destroyed we can call some clean up codes here
//    Does not works with prototype beans
    @PreDestroy
    public void doMYCleanupStuff(){
        System.out.println("In doMYCleanupStuff(): " + getClass().getSimpleName());
    }
}
