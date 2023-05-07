package com.demo.test11;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A {
	
	public static void main(String[] args) {
		
//		Map<Integer, String> map =new HashMap<>();
//		map.put(1, "one");
//		map.put(2, "two");
//		map.put(3, "three");
//		map.put(4, "four");
		
//		Map<Employee, String> map =new HashMap<>();
//		
//		map.put(new Employee("Ramesh", 123), "ramesh");
//		map.put(new Employee("john", 2345), "john");
//		map.put(new Employee("Marry", 3452), "Marry");
//		map.put(new Employee("gopal", 23423), "gopal");
//		map.put(new Employee("Ramesh", 123), "Ramesh");
//		
//		
		String str ="abcefg";
		  
		int len = str.length();
		
		int midpoint =len/2;
		
		StringBuilder builder =new StringBuilder();
		for(int i =0,j=len-1;i<=midpoint;i++,j--) {
			if(i == j) {
				
				builder.append(str.charAt(i));
			}
			if(j>0) {
			builder.append(str.charAt(i));
			builder.append(str.charAt(j));
			}
		}
		System.out.println(builder.toString());
	}

}
