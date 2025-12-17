package com.learn.springboot.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//We can provide the package names to be scanned which are outside main package
@SpringBootApplication(scanBasePackages = {"com.learn.springboot.demo",
											"com.learn.springboot.util"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean // Runs after the application context is loaded and right before the Spring Application main method is completed.
	// Can also be used to run some piece of code at the startup of the application
	public CommandLineRunner commandLineRunner(String[] args) {
		return runner -> {
			System.out.println("Hello from CommandLineRunner");
		};
	}

}
