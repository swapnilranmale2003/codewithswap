package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello Swapnil!");
		int age = 25;
		double salary = 50000.50;
		System.out.println(age);
		System.out.println(salary);
	}
}
