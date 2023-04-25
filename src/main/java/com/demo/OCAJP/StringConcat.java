package com.demo.OCAJP;

public class StringConcat {
     
	public static void main(String[] args) {
		 
		  String name="john";
		  
		  String anotherName="john";
		  
		  String newName ="jo" + "hn";
		  
		 System.out.println(System.identityHashCode(name));
		 System.out.println(System.identityHashCode(anotherName));
		 System.out.println(System.identityHashCode(newName));
		 
	}
}
