package com.controls;

public class IfStatement {

	public static void main(String[] args) {
		
		int x=100;
		int y=200;
		int c= 150;
		
		if(x > c) {
			
			System.out.println(x + " is greater than " + c);
		}
		else if (y > c) {
			System.out.println(y + " is greater than " + c);
		}
		else{
			
			System.out.println(x + " is less than " + c);
		}

	}

}
