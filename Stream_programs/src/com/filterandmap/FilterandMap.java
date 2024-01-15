package com.filterandmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;



public class FilterandMap {

	public static void main(String[] args) {

		List<Product1> productList = new ArrayList<Product1>();

		productList.add(new Product1(1, "Hp Laptop", 45000f));
		productList.add(new Product1(2, "Dell Laptop", 30000f));
		productList.add(new Product1(3, "Lenevo Laptop", 28000f));
		productList.add(new Product1(4, "Sony Laptop", 28000f));
		productList.add(new Product1(5, "Apple Laptop", 90000f));
		
		
		//Filtering product price == 30,000 and Iterating Collection //using lambda       
        productList.stream()
                    .filter(product1->product1.price == 30000)
                    .forEach(product1-> System.out.println(product1.getName()));
        
        
      //Filtering product price == 30,000 and using map and Iterating Collection //using lambda       
        productList.stream()
                    .filter(product1->product1.price == 30000)
                    .map(product1 -> product1.getName())
                    .forEach(product1-> System.out.println(product1));
        
        
      //Filtering product price == 30,000 and Iterating Collection //using method reference       
        productList.stream()
                    .filter(Product1 :: productPriceEqualToThirtyThousand)
                    .map(Product1 :: getName)
                    .forEach(System.out :: println);
        
        
        //Filtering product price > 30,000 by using Stream and printing as list
        List<Float> productPriceList =   productList.stream()
                                                 .filter(product1-> product1.price>30000f)
                                                 .map(product1-> product1.price)
                                                 .collect(Collectors.toList());
         System.out.println(productPriceList);
         
         
      // Converting product List into Set  
         Set<Float> productPriceListintoSet =   productList.stream()  
                            
       		                   .filter(product1->product1.price < 40000)   // filter product on the base of price  
                               .map(product1->product1.price)  
                               .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
         System.out.println(productPriceListintoSet);  
         
         
      // Converting Product List into a Map  
         Map<Integer,String> productPriceMap =    productList.stream()  
                             
       		                 .collect(Collectors.toMap(p->p.id, p->p.name));  
               
         System.out.println(productPriceMap);  
        
	}

}
