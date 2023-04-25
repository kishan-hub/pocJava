package com.demo.constructor;

public class Test {
	
	public Test() {
		this(10);
		System.out.println("no-arg-constructor");
	}
	
	Test(int i){
		 this(10.5);
		System.out.println("init-arg-constructor");
	}
	Test(double d){
		System.out.println("double-arg-constructor");
	}
     
	public static void main(String[] args) {
		
		Test t1 = new Test();
		Test t2 =new Test(10);
		Test t3 =new Test(10.5d);
	}
}
