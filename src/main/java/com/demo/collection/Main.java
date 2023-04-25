package com.demo.collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Employee> employeeList =new ArrayList<>();
		
		employeeList.add(new Employee("John","Smith", 123));
		employeeList.add(new Employee("kevin","dad", 234));
		employeeList.add(new Employee("mike", "Wilson", 231));
		employeeList.add(new Employee("jon","doe", 432));
		
		
		employeeList.forEach(employee->System.out.println(employee));
		
		
		employeeList.set(3, new Employee("john","tieson", 2345));
		
		System.out.println();
		employeeList.forEach(System.out::println);
		employeeList.get(1);
		
		System.out.println(employeeList.isEmpty());
		
		System.out.println(employeeList.contains( new Employee("john","tieson", 2345)));
		
		employeeList.remove(2);
		
		employeeList.forEach(System.out::println);
		
	}

}
