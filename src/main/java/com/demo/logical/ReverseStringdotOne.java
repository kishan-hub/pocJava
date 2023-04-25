package com.demo.logical;

public class ReverseStringdotOne {
	
	public static void main(String[] args) {
		
		String str ="Welcome to java world for reverse String";
		
		String reversed =reverse(str);
		
		System.out.println(reversed);
		
	}
	
	public static String reverse(String string) {
		
          StringBuffer buffer =new StringBuffer();
          char[] charArray = string.toCharArray();
          for(int i=charArray.length -1 ;i>=0;i--) {
        	  buffer.append(charArray[i]);
          }
		return buffer.toString();
	}
	
	

}
