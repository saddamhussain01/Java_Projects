package com.variables;

public class Test1 {
	
	int i = 10;    // instance variable
	
	static String name = "static variable" ;  //Static variable
	
	//constructor
	public Test1() {
		System.out.println("Constructor of Test1 class");
	}

	//static method
	public static void testMethod() {
		
		String str = "local variable in static method";   //local variable
		
		System.out.println(str);
	}
	
	public void testMethod1() {
	
		String str = "local variable in static method";   //local variable
		
	}

	public static void main(String[] args) {
		
		//calling and printing static variable
		System.out.println(name);  
		
		//creation of object
		Test1 test = new Test1(); 
		
		//if we call instance variable its required object
		System.out.println(test.i);
		
		//if we call non-static method its required object
	    test.testMethod1();
		
		//if we call static method its not required object
		testMethod();



	}

}
