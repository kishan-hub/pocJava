package com.demo.staticmod;

import java.util.Arrays;
import java.util.List;

public class Student {
 
	String name;
	int rollno;	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
	public Student(String name,int rollno) {
		// TODO Auto-generated constructor stub
		this.name =name;
		this.rollno=rollno;
	}
	
	public static void main(String[] args) {
		Student s1 =new Student("DURGA", 10);
		Student s2 =new Student("KISHAN", 21);
		Student s3 =new Student("James", 22);
		
		List<Student> studentList=Arrays.asList(s1,s2,s3);
		
		System.out.println(studentList);
		
		
	}
}
