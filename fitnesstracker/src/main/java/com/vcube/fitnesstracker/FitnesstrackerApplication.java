package com.vcube.fitnesstracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages="com.vcube.fitnesstracker"
		)
public class FitnesstrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitnesstrackerApplication.class, args);
	}

}
