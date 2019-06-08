package com.vishwa.ObjectExamples;

public class Calculator {
	
	//Constructors
	public Calculator() {
		//Whenever we create object
		//Code inside this will be executed
		
		System.out.println("Creating object");
		
	}
	
	int num1 ;
	int num2 ;
	
	int sum() {
		return num1+num2 ;
	}
	
	int difference() {
		return num1-num2;
	}
	
	//Extend it for multiplication and division and run from test class

}
