package com.demo.datastructure.stack;

import java.util.LinkedList;

public class CheckForPalidrome {
	
	public static boolean checkforPalidrome(String string) {
		LinkedList<Character> stack = new LinkedList<>();
		StringBuilder stringNoPunchuation = new StringBuilder(string.length());
		String lowerCase =string.toLowerCase();
		
		for(int i= 0;i<lowerCase.length();i++) {
			char c =lowerCase.charAt(i);
			
			if(c>='a' && c<='z') {
				stringNoPunchuation.append(c);
				stack.push(c);
			}
		}
		
		StringBuilder reversedString =new StringBuilder(stack.size());
		while (!stack.isEmpty()) {
			reversedString.append(stack.pop());
		}
		
		return reversedString.toString().equals(stringNoPunchuation.toString());
			
	}
	
	public static void main(String[] args) {
		System.out.println(checkforPalidrome("abccba"));
		System.out.println(checkforPalidrome("was it a car cat i saw"));
		
	}

}
