package com.unchecked;

public class UncheckedException {
	
	
	// unchecked exception
	public static void validate(int age) throws InvalidAgeException  {
		
		if(age > 18) {
			
			System.out.println("welcome to vote");
		
			
		}
		else {
			throw new InvalidAgeException("age is not valid to vote");
		}
	}

	public static void main(String[] args)  {
		
		UncheckedException t=new UncheckedException();
		
		try {
			
			validate(10);
			
		} catch (InvalidAgeException e) {
			
			//e.printStackTrace();
			System.out.println("invalid age");
		}
		System.out.println("rest of the code");
	}
}
