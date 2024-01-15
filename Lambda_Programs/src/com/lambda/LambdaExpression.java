package com.lambda;



public class LambdaExpression{

	public static void main(String[] args) {
		
		String name ="saddam";
		
		//1st way
		Sayable s = () -> System.out.println("Say something");

		s.say();
		
		
		
		//2nd way
		Sayable s1=()->{
			
			System.out.println("say something new topic");
			
		};
		
		s1.say();
		
		
		
	}

}
