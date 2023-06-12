package com.demo.operators;

public class BitDemo {
	
	public static void main(String[] args) {
         int bitmask =0x00F;
         int val =0x2222;
        
         System.out.println(bitmask);
         System.out.println(val);
        
         //Prints "2"
         
         System.out.println(val & bitmask);
		System.out.println(~bitmask);
		System.out.println(bitmask<<3);
		System.out.println(bitmask>>4);
		
		System.out.println(bitmask>>>4);
	}

}
