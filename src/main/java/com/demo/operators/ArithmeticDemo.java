package com.demo.operators;

import java.awt.image.RescaleOp;

public class ArithmeticDemo {
	
	public static void main(String[] args) {
		
		int result =1+2;
		
		//result is now 3
		System.out.println("1 + 2 =" +result);
		
		result =result - 1;
		
		//result is Now 2
		
		result =result -1;
		int original_result=result;
		
		
		System.out.println(original_result+" - 1 =" +result);
		
		result =result + 8;
		
		System.out.println(original_result+" + 8 =" +result);
		//result is now 10
		
		result =result % 7;
		
		System.out.println(original_result+" %7 =" +result);
		
	}

}
