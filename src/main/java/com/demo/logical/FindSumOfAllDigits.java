package com.demo.logical;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindSumOfAllDigits {
	
	public static void main(String[] args) {
		
		
		System.out.println(findSumOfAllDigits(556575743874784l));
	}
	
	public static long findSumOfAllDigits(long digits) {
		
		long sum=0,d;
		long temp;
		
		 temp =digits;
		 
		 while(temp!=0) {
			 
			d=temp % 10;
			sum +=d;
			temp =temp/10;
		 }
		 return sum;
	}

}
