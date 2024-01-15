package com.wrapper;

public class AutoBoxing {

	public static void main(String[] args) {
		
		int a= 10;
		
		//converting int into Integer explicitly
		Integer i = Integer.valueOf(a); 
		
		//autoboxing, now compiler will write Integer.valueOf(a) internally
		Integer j =a;  
		
		System.out.println(a + " " + i + " "  + j);
		

		
		
	}

}
