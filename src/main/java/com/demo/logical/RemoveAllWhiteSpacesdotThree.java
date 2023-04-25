package com.demo.logical;

public class RemoveAllWhiteSpacesdotThree {
	
	public static String removeWhileSpaces(String string) {
		
	     StringBuffer buffer  = new StringBuffer(string.length());
	     char[] charArray = string.toCharArray();
	     
	      for(char ch:charArray) {
	    	  
	    	  if(ch!= ' ') {
	    		buffer.append(ch);  
	    	  }
	      }
	      return buffer.toString();
	}
	public static void main(String[] args) {
		String str=" welcome to java language programming language ";
		
		System.out.println(removeWhileSpaces(str));
		
	}

}
