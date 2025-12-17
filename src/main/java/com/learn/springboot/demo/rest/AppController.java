package com.learn.springboot.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot.demo.util.Coach;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AppController {

//    Injecting values from app.properties
    @Value("${info.app.name}")
    private String appName;

    @Value("${info.app.description}")
    private String appDescription;

//  define a private field for the dependency injection
//  @Qualifier is used to identify which implementation
//  of the interface to be used if multiple implementation have been created for a interface.
//  We can also use @Primary above a class with @Component to make a bean default if no qualifier has been assigned

//  Field injection
//    @Autowired
//    @Qualifier("footballCoach")
    private Coach myCoach;
//    private Coach anotherCoach;

//    Dependency injection using constructor
    @Autowired
    //Constructor name same as class name
    public AppController(@Qualifier("aquatic") Coach theCoach
//                         @Qualifier("footballCoach") Coach anotherTheCoach
                         ) {
        this.myCoach = theCoach;
//        this.anotherCoach = anotherTheCoach;
    }

//  Dependency injection using setter injection
//    @Autowired
//    public  void setCoach(@Qualifier("baseBallCoach") Coach theCoach) {
//        myCoach = theCoach;
//    }

//    @GetMapping("/check")
//    public  String checkScope(){
//        //it will return false for prototype and true for singleton beans
//        return  ("check myCoach == anotherCoach  " + (myCoach == anotherCoach));
//    }

    @GetMapping("/daily-workout")
    public  String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/")
    public Map<String, String> sayHello(){
        Map<String,String> response = new HashMap<>();
        response.put("appName", appName);
        response.put("appDescriptions", appDescription);
        return response;
    }
}