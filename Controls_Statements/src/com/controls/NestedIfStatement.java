package com.controls;

public class NestedIfStatement {

	public static void main(String[] args) {
		
		String address = "Andhra pradesh";

		if (address == "Andhra pradesh") {
			
			if (address.contains("Bangalore")) {
				System.out.println("Your city is Andhra pradesh");
				
			} 
			
			else if (address.contains("Telangana")) {
				System.out.println("Your city is Telangana");
			} 
			
			else {
				System.out.println("Your are living in different state ");
			}
			
		}
		
		else {
			System.out.println("You are not living in India");
		}
	}
}
