package com.demo.operators;

public class BitDemo {
	
	public static void main(String[] args) {
         int bitmask =0x00F;
         int val =0x2222;
         
         //Prints "2"
         
         System.out.println(val & bitmask);
		
	}

}
