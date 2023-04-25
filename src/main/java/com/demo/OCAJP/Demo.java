                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 package com.demo.OCAJP;

import com.demo.constructor.A;
import com.demo.exception.AdditionNotFoundException;

public class Demo {
	
	public static void main(String[] args) throws AdditionNotFoundException,Exception {
	      
		A a=new A();
		int c =a.addition("10a", "20");
		System.out.println(c);
	}

}
