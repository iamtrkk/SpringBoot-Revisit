package com.learn.springboot.demo.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Configuration file to create bean when using @Component is not possible
//Example creating bean for a third party class like Amazon S3
@Configuration
public class SportConfig {

//    @Bean used to identify that it created a new bean to inject
    @Bean("aquatic") // We can provide a custom name to the bean that can be used in @Qualifier instead of className
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
