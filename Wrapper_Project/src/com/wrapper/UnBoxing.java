package com.wrapper;

public class UnBoxing {

	
	public static void main(String[] args) {
		
		
	Double d= new Double(20.0);
	
	//converting wrapper class Integer into int explicitly
	double i = d.doubleValue();
	
	//unboxing, now compiler will write d.intValue() internally
	double j = d;
	
	System.out.println(d + " " + i + " " + j );
		
	}

}
