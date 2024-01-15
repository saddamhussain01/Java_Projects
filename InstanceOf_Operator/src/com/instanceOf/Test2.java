package com.instanceOf;

public class Test2 extends Test1{

	public static void main(String[] args) {
		
		Test2 test = new Test2();
		
		System.out.println(test instanceof Test1);
		
		Test2 t = null;
		
		System.out.println(t instanceof Test2);
		
	}

}
