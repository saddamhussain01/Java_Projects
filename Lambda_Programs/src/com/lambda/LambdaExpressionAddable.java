package com.lambda;

public class LambdaExpressionAddable {

	public static void main(String[] args) {
		
		//1st way
		Addable add = (a,b) -> {
			
			return (a + b);
		};
		
		System.out.println(add.add(10, 20));

		
		
		//2nd way
		Addable add1=(int a,int b) -> (a+ b);
		
		System.out.println(add1.add(100, 200));
		
		
	}

}
