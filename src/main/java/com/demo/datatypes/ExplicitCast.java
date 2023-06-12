package com.demo.datatypes;

public class ExplicitCast {
	
	public static void main(String[] args) {
		
		int i=167;
		byte b=(byte)i;
		System.out.println(b);
		
		
		int x =97;
		char ch =(char)x;
		System.out.println(ch);
		
		int m = 612;
		byte n=(byte)m;
		char o = (char)n;
        System.out.println(o);
        
        Object obj = new Object();
        System.out.println(obj.toString());
	}

}
