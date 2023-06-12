package com.demo.operators;

public class ConditinalDemo2 {
	
	public static void main(String[] args) {
		int value1=4;
		
		int value2=2;
		int value3=1;
		int result=0;	
	  //usese of ternary operato
		
		//find the biggest value 
		result = (value1>value2 && value1>value3)?value1:(value2>value3)?value2:value3;
		
		System.out.println(result);
      
	}

}
