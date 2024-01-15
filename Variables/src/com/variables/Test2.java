package com.variables;

public class Test2  extends Test1{
	
	 String name = "variable of subclass";

	public Test2() {
		
		/*calling super class constructor.
		super keyword is used to call only super class variables and methods.*/ 
		super();     
		
		
		/* this keyword is calling variables and methods in same class . 
		 In same class variables and methods is not available means 
		 this keyword is call to super class variables and methods also.  */
		System.out.println(this.name);
		System.out.println("Constructor of Test2 class");
	}

	public static void main(String[] args) {

    Test2 test = new Test2();
    
    
    
    

	}

}
