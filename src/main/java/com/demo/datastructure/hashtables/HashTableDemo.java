package com.demo.datastructure.hashtables;

import com.demo.datastructure.stack.Employee;

public class HashTableDemo {
	
	public static void main(String[] args) {
	 
	 SimpleHashtable hashTable= new SimpleHashtable();
	  
	 Employee janeJones = new Employee("Jane","Jones", 123);
	 Employee johnDoe  =new Employee("john","Doe", 4567);
	 Employee marySingh =new Employee("marry", "Singh", 22);
	 Employee mikeWilson =new Employee("mike", "Wilson", 3245);
	 Employee billEnd =new Employee("bill","End", 4565);
	 hashTable.put("jane",janeJones);
	 hashTable.put("john", johnDoe);
	 hashTable.put("mary",marySingh);
	 hashTable.put("mike",mikeWilson);
	 hashTable.put("bill", billEnd);
	 
	  hashTable.printHashtable();
	  
	 
	}

}
