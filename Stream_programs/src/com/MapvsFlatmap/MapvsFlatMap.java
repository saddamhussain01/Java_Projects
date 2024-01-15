package com.MapvsFlatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapvsFlatMap {

	public static void main(String[] args) {

		List<Employee> emp = Arrays.asList(new Employee(1, "saddam", Arrays.asList("9989294552", "7036776766")),
				new Employee(1, "Ali", Arrays.asList("9946694552", "703344546")),
				new Employee(1, "Arif", Arrays.asList("95554444552", "704567866")));

		// Data Transformation map();

		List<String> list = emp.stream().map(em -> em.getName()).collect(Collectors.toList());

		System.out.println(list);
		
		
		//phone numbers of all employees
		
		System.out.println(emp.stream().map(em -> em.getMobileNumbers()).collect(Collectors.toList()));
		
		
		//Data Transformation + flattening flatMap();
		System.out.println(emp.stream().flatMap(em -> em.getMobileNumbers().stream()).collect(Collectors.toList()));

	}

}
