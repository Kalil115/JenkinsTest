package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootOnJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOnJenkinsApplication.class, args);
		System.out.println("Hello");
	}

}
