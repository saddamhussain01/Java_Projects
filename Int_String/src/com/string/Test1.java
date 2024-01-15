package com.string;

public class Test1 {

	public static void main(String[] args) {
		
		int i = 10;
		
		// using valueOf method that is present in String class
		String str = String.valueOf(i);
		
		
		System.out.println(str);
		System.out.println(str + i);
		System.out.println(str + str);
		
		System.out.println("==============================");
		
		//using toString method that is present in Integer class
		String str1 = Integer.toString(i);
		
		System.out.println(str1);
		System.out.println(str1 + i);
		System.out.println(str1 + str1);
		
		
	}

}
