package com.demo.constructor;

import com.demo.exception.AdditionNotFoundException;

public class A {
	
	public A() throws Exception {
		System.out.println("Default constructor");
	}
	
    public int addition(String a, String b) throws AdditionNotFoundException {
    	  return Integer.parseInt(a)+Integer.parseInt(b);
    }
}
