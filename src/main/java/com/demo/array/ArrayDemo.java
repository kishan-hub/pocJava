package com.demo.array;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int[] anArray;
		
		//Allocates Memory for Integers
		anArray =new int[10];
		
		//initilize first element
		anArray[0] =100;
		
		anArray[1] =200;
		
		anArray[2] =300;
		
		anArray[3] =400;
		
		anArray[4] =500;
		
		anArray[5] =600;
		
		anArray[6] =700;
		
		anArray[7] =800;
		
		anArray[8] =900;
		
		anArray[9] =1000;
		
		for(int i=0;i<anArray.length;i++) {
			System.out.println("Elemenet at index  "+i+": "+anArray[i]);
		}
	
	}

}
