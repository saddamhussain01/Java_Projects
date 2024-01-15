package com.strings;

public class CountCharactersInString {

	public static void main(String[] args) {
		
		String str = "saddam Hussain";
		
		char[] ch = str.toCharArray();
		
		int count = 0;
		
		int i = 1;
		
		while( i >= ch.length) {
			
			count ++;
			i++ ;
			
		}
		
		System.out.println(count);

	}

}
