package com.demo.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("john","doe",12);
		
		List<Employee> employyeList =new ArrayList<>();
		
		employyeList.add(new Employee("john", "doe", 12));
		employyeList.add(new Employee("rakesh", "dhawan", 123));
		employyeList.add(new Employee("stev", "miler", 14));
		employyeList.add(new Employee("Harry", "peeter",122));
		employyeList.add(new Employee("peeter","markonowitch", 121));
		
//		employyeList.forEach(System.out::println);
//		
//		System.out.println(employyeList.isEmpty());
//		
//		System.out.println("size of EmployeList :: "+employyeList.size());
//		
//		employyeList.add(3,new Employee("Harry", "Potter", 122));
//		
//		employyeList.forEach(System.out::println);
//		System.out.println();
//		Employee[] employeeArray =employyeList.toArray(new Employee[employyeList.size()]);
//		
//		for(Employee employee:employeeArray) {
//			System.out.println(employee);
//		}
		
		DoublyLinkedList list = new DoublyLinkedList();
	//	EmployeeLinkedList list=new EmployeeLinkedList();
		list.addToFront(new Employee("jane", "jones", 10));
		list.addToFront(new Employee("john","doe", 11));
		list.addToFront(new Employee("mary","Smith", 12));
		list.addToFront(new Employee("mike","Wilson", 14));
		
	    list.addToEnd(new Employee("rahul","verma", 15));
	    list.addToEnd(new Employee("kran","sahu", 16));
	    
	    System.out.println(list.isEmpty());
	    
	     list.printList();
		
	}

}
