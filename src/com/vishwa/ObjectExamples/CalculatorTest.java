package com.vishwa.ObjectExamples;

public class CalculatorTest {
	
	public static void main(String args[]) {
		
		Calculator myCalculator = new Calculator();
		
		myCalculator.num1 = 10 ;
		myCalculator.num2 = 7;
		
		int sum =myCalculator.sum();
		
		System.out.println(sum);
		
		System.out.println(myCalculator.difference());
	}

}
