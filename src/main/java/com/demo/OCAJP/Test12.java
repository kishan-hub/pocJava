package com.demo.OCAJP;

public class Test12 {
	
	{
		System.out.println("Non static block");
	}
	static
	{
		System.out.println("static block");
	}
	Test12()
	{
		System.out.println("constructor");
	}
   public static void main(String[] args) {
		
		Test12 t1 =new Test12();
		 System.out.println("main");
		
		Test12 t2 =new Test12();
		
	}
}
   //oP:static bock
   //   Non static block
   //   constructor
   //   main
