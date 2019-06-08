package com.vishwa.ObjectExamples;

public class Boy {
	//Attributes
		String name ;
		
		String hobby ;
		
		int age ;
		
		
	//There will always be a constructor
	//Default constructor
	public Boy() {
		
		name = "Vishwa" ;
		hobby="football";
		age=15;
		
	}
	
	//Other types of constructors
	//Overloaded contructors
	
	public Boy(String boyName) {
		name = boyName ;
	}
	
	public Boy(String boyName, String boyHobby) {
		name = boyName ;
		hobby = boyHobby ;
	}
	
	public Boy(String boyName, String boyHobby , int boyAge) {
		name = boyName ;
		hobby = boyHobby ;
		age= boyAge;
	}
	
	void printBoyDetails() {
		System.out.println( "Name = "+ name + " hobby = "+ hobby + " age = "+age );
		
	}
	
	
	//Behaviour
	void play() {
		//System.out.print("I am playing");
		System.out.println( "I am playing "+ hobby);
		// "I am " + "Vishwa" = "I am Vishwa"
	}
	
	void speak() {
		System.out.println( " I am speaking");
	}
	
	//You have to add this method
	public static void main(String args[]) {
		
		Boy boy2 = new Boy();
		
		boy2.play();
		
	}
}

// Object

// Boy1  -> name = "Vishwa", hobby="cric" , age="28"
 //  Boy2 -> name = "Mohan", hobby="baddy" , age="78"
 //  Boy3 -> name = "Akash", hobby="" , age="16"



//How to create object

/**
 * Constructors in Java
 * 
 * Boy boy1 = new Boy();
 * 
 * 
 */
