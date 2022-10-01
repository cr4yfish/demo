package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static int add(int first, int second) {
		return first + second;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("\nHello World");

		Scanner sc= new Scanner(System.in);
		sc.reset();
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();  
		
		int result = add(a, b);

		System.out.println("Result: " + result);

		sc.close();
	}

}
