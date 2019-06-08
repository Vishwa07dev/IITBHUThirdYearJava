package com.vishwa.ObjectExamples;

public class TestClass {
	
	public static void main(String args[]) {
		//Code inside this method will be executed
		
		//I have create an object of type Boy
		
		Boy boy1 = new Boy();
		
		Boy boy2 = new Boy("Vishwa");
		
		Boy boy3 = new Boy("Vishwa", "Cricket");
		
		Boy boy4 = new Boy("Mohan", "football", 25);
		
		boy1.printBoyDetails();
		boy2.printBoyDetails();
		boy3.printBoyDetails();
		boy4.printBoyDetails();
		
		
		
		/**
		 * There are two kind of spaces in Java
		 * 
		 * Heap | Stack
		 * 
		 * Object get stored in heap memory
		 */
		
		
		//boy1 is the object of type Boy
	    // Class variableName = new constructor ;
		
		// objectVariable.methodName
		
		
		
		
		/*boy1.name = "Abhishek";
		boy1.age = 25;
		boy1.hobby = "cricket" ;
		
		boy1.play();
		
		Boy boy2 = new Boy();
		boy2.name = "Salman";
		boy2.age = 27;
		boy2.hobby = "studying" ;
		
		boy2.play();*/
		
		
		
	
	}

}
