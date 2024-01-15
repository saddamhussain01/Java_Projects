package com.enums;

public class Test {
	
	enum Level {
		
		
		LOW,
		MEDIUM,
		HIGH
		
		
		
	}

	public static void main(String[] args) {
		
		Level l = Level.HIGH;
		
		System.out.println(l);
		
		System.out.println("==================");
		
		
		//for each loop 
		for (Level lev : Level.values()) {
			System.out.println(lev);
		}
		
		
	}

}
