package com.checked;



public class 	CheckedException {
	
	public static void validate(int age){
		
		if(age > 18) {
			System.out.println("you are eligible for vote");
		}
		else {
			throw new InvalidAgeException1("your age is below 18");
		}
	}

	
	public static void main(String[] args)  {
		
		CheckedException t1=new CheckedException();
		
		validate(10);
		System.out.println("rest of the code");
		
	}
}
