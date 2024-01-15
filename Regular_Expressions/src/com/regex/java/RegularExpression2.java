package com.regex.java;

import java.util.regex.Pattern;

public class RegularExpression2 {

	public static void main(String[] args) {
		
		
		//Regex Character classes only match one letter
		
		System.out.println(Pattern.matches("[abc]", "saddam")); 
		System.out.println(Pattern.matches("[abc]", "a"));
		
		System.out.println();
		
		System.out.println(Pattern.matches("[^abc]", "saddam"));
		System.out.println(Pattern.matches("[^abc]", "h"));
		
		System.out.println();
		
		System.out.println(Pattern.matches("[a-z]", "98"));
		System.out.println(Pattern.matches("[a-z]", "b"));
		
		System.out.println();
		
		System.out.println(Pattern.matches("[A-Z]", "Za"));
		System.out.println(Pattern.matches("[A-Z]", "Z"));
		
		System.out.println();
		
		System.out.println(Pattern.matches("[0-9]", "56"));
		System.out.println(Pattern.matches("[0-9]", "5"));
		
		System.out.println();
		
		System.out.println(Pattern.matches("[a-z A-Z 0-9]", "saddam"));
		System.out.println(Pattern.matches("[a-z A-Z 0-9]", "s"));
	}

}
