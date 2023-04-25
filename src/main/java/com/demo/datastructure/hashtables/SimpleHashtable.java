package com.demo.datastructure.hashtables;

import com.demo.datastructure.stack.Employee;

public class SimpleHashtable {
	
	private Employee[] hashtable;
	
	public SimpleHashtable() {
		hashtable =new Employee[10];
	}
	
	public void put(String key,Employee employee) {
		
		int hashedKey = hashKey(key);
		
		if(hashtable[hashedKey]!=null) {
			System.out.println("Sorry there are already employee at position "+hashedKey);;
		}
		else
		{
			hashtable[hashedKey] = employee;
		}
	}
	
	public Employee get(String key) {
		int hashedKey = hashKey(key);
		
		return hashtable[hashedKey];
	}
	
	private int hashKey(String key) {
		return key.length() % hashtable.length;  //5 % 10
	}
  
   public void printHashtable() {
	    
	    for(int i =0;i<hashtable.length;i++) {
	    	
	    	System.out.println(hashtable[i]);
	    }
   }
}
