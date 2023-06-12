package com.demo.operators;

public class InstanceOfDemo {

	
	public static void main(String[] args) {
		
		Parant obj1 = new Parant();
		
		Parant obj2 =new Child();
		
		System.out.println("obj1 instanceof Parent: "+(obj1 instanceof Parant));
		
		System.out.println("obj1 instanceof Child: "+(obj1 instanceof Child));
     
		System.out.println("obj2 instanceof Parent: "+(obj2 instanceof Parant));
		
		System.out.println("obj2 instanceof child: "+(obj2 instanceof Child));
		
		System.out.println("obj1 instance of MyInterface: "+(obj1 instanceof MyInterface));
		
		System.out.println("obj2 instance of MyInterface: "+(obj2 instanceof MyInterface));
   
	}
	
	
}

interface MyInterface{}

class Parant{}

class Child extends Parant implements MyInterface{}

