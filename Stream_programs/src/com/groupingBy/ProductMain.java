package com.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ProductMain {

	public static void main(String[] args) {
		
		List<Product> list = Arrays.asList(
				new Product(1, "RedmiMobile", 15000),
				new Product(2, "VivoMobile", 17000),
				new Product(3, "SamsungMobile", 14000),
				new Product(4, "RedmiNote5Mobile", 12000),
				new Product(5, "IQQ3Mobile", 15000));
		
		
    //groupingBy(Function)		

	Map<Object, List<Product>>	groupByPrice=list.stream().collect(Collectors.groupingBy(p -> p.getPrice()));
	
	System.out.println(groupByPrice);
	
	
	//groupingBy(Function,Collector)
		
	Map<Object, List<String>> groupingByAndName = list.stream().collect(Collectors.groupingBy(p -> p.getPrice(),
			Collectors.mapping(Product::getName, Collectors.toList())));

	System.out.println(groupingByAndName);
	
 
	//groupingBy(Function,supplier,Collector)
	
	Map<Object, List<String>> groupingByNamewithPriceOrder =list.stream().collect(Collectors.groupingBy(p -> p.getPrice(),
			() -> new TreeMap<>(), 
			Collectors.mapping(Product::getName, Collectors.toList())));
	
	System.out.println(groupingByNamewithPriceOrder);
	
	
	}
}
