package com.demo.OCAJP;

public class StringLiteral { 
	
	public static void main(String[] args) {
		
		String str1 ="abc";
		
		String str2="ab";
		
		String str3 =str2 + "c";
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
	}

}
