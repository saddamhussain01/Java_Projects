package com.MapvsFlatmap;

import java.util.List;

public class Employee {
	
	int empId;
	String name;
	List<String> mobileNumbers;
	
	
	
	
	public Employee(int empId, String name, List<String> mobileNumbers) {
		super();
		this.empId = empId;
		this.name = name;
		this.mobileNumbers = mobileNumbers;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getMobileNumbers() {
		return mobileNumbers;
	}
	public void setMobileNumbers(List<String> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", mobileNumbers=" + mobileNumbers + "]";
	}
	
	

}
