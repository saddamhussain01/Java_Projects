package com.map.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class TestMap {

	public static void main(String[] args) {
		
		
		//Map<Integer, String> map=new HashMap<>();         // unordered list
		
		//Map<Integer, String> map= new LinkedHashMap<>();    //  ordered list
		
		Map<Integer, String> map= new TreeMap<>(); 
		
		map.put(600, "Saddam");
		map.put(200, "Hussain");
		map.put(300, "Naveen");
		map.put(400, "Rahul");
		map.put(500, "Sai");
		map.put(100, "Likesh");
		//map.put(null, null);
		map.put(700, null);
		map.put(600, "Saddam");
		
		
		//for each loop
		System.out.println("using for each loop");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			
			System.out.println(m);
		
			
		}
		
		System.out.println("===================");
		System.out.println("using Iterator interface");
		Iterator<Entry<Integer, String>> itr =map.entrySet().iterator();
		 
		 while (itr.hasNext()) {
			
			 System.out.println(itr.next());
		}
		
		

	}

}
