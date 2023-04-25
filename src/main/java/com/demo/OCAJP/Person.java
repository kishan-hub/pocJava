package com.demo.OCAJP;

public abstract class Person {
	
	String name;
	
	int age;
	
	int rollno;
	
	String parantName;
	
	String schoolName;
	
	public Person() {
		
        System.out.println("Person Constructor instantiated");
        System.out.println(this.hashCode());
	}

}
