package com.string.programs;

public class StringConcept {
	
	public static void main(String[] args) {
		
		char [] ch = {'s','a','d','d','a','m'};
		
		String s= new String(ch);  //creating Java string by new keyword
		
		System.out.println(s);
		
		
		String s1="java";//creating string by Java string literal 
		String s2="java";
		String s3= "JaVa";
		String s4= " practice";
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.codePointAt(1));
		System.out.println(s1.codePointBefore(1));
		System.out.println(s1.codePointCount(0, 4));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s1.concat(s3));
		System.out.println(s1.contains(s2));
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s1.indent(10));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf("va"));
		System.out.println(s1.intern());
		System.out.println(s4.endsWith("e"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.matches(s2));
		System.out.println(s1.replace('j', 'a'));
		System.out.println(s1.strip());
		System.out.println(s.toCharArray());
		System.out.println(s1.toString());
		System.out.println(s1.chars());
	
	}

}
