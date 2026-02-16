package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class DemoApplication {
	public static int add(int a, int b) {
		sub(3,2);
		return a + b;
	}
	public static int sub(int a,int b){
		int resultSub = a-b;
		System.out.println("Substract- "+resultSub);
		return resultSub;

    }
	String name;
	void display(){
		System.out.print(name);
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello Swapnil!");
		int age = 25;
		long population = 100000000L;
		double salary = 50000.50;
		System.out.println("Int "+age+" Long "+population);
		System.out.println(salary);

		String name = "Swapnil";
		System.out.println(name);

		String patientName = "John Doe";
		long phoneNumber = 9021190242L;
		boolean isActive = true;
		System.out.println(patientName+phoneNumber+isActive);

		int a = 10;
		int b = 5;
		System.out.println(a + b);

//		Control Statements
		int yearsOfExperience = 4;
		if (yearsOfExperience>2){
			System.out.println("Employee can extend agreement");
		}
		else{
			System.out.println("Hold");
		}

		int day = 10;
		switch (day){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			default:
				System.out.println("Wrong Input");
		}
		for(int i = day;i<=20;i++){
			System.out.println(i);
		}

		int i = 1;

		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		System.out.println("For Loop In Array");
		int[] numbers = {10, 20, 30, 40, 50};
		for (i=0;i<numbers.length;i++){
			System.out.println(numbers[i]);
		}

		int result = add(5, 3);
		System.out.println("Add- "+result);

		DemoApplication providerInfo = new DemoApplication();
		providerInfo.name = "Aston";
		providerInfo.display();


	}
}
