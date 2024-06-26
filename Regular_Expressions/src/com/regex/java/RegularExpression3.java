package com.regex.java;

import java.util.regex.Pattern;

public class RegularExpression3 {

	public static void main(String[] args) {
		
		//Regex Metacharacters only match one letter
		
		System.out.println(Pattern.matches("\\d", "2")); // digits
		
		System.out.println(Pattern.matches("\\D", "h")); // non digits
		
		System.out.println(Pattern.matches("\\s", " ")); // white space
		
		System.out.println(Pattern.matches("\\S", "5")); // non white space
		
		System.out.println(Pattern.matches("\\w", "h")); // word character
		
		System.out.println(Pattern.matches("\\W", "#")); // non word character
		
		
	}

}
