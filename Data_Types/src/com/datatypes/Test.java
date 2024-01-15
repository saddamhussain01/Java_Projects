package com.datatypes;

public class Test {

	public static void main(String[] args) {

		
		System.out.println(Byte.SIZE/8);
		System.out.println(Short.SIZE/8);
		System.out.println(Integer.SIZE/8);
		System.out.println(Long.SIZE/8);
		System.out.println(Float.SIZE/8);
		System.out.println(Double.SIZE/8);
		
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		//byte  b = 128;
		
		byte b =20;
		
		int i = b;  // widening casting or down casting or implicit type casting
		System.out.println("widening casting value " + i);
		
		
		byte b1 = (byte) i ;  // Narrowing casting or up casting or explicit type casting
		System.out.println("Narrowing casting value " + b1);
		
		int j =200;
		
		byte b2 = (byte) j;
		System.out.println("Narrowing casting value " + b2);
		

	}

}
