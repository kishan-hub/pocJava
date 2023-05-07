package com.demo.logical.day2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ArmstrongNumberSeven {
	
	public boolean isArmstrongNumber(int no) {
		   
		int sum=0;
		int d;
		int temp;
		
		temp =no;
		int numDigits=String.valueOf(no).length();
		while(temp!=0) {
			d=no%10;
			sum+=Math.pow(d,numDigits);
			temp=temp/10;
		}
		return sum == no;
	}
	/* same logic by using functional Programming*/
	public static boolean isArmstrongNoByFunctional(int no) {
		
		int digits= String.valueOf(no).length();
		return IntStream.range(0, digits)
				        .map(i->Character.getNumericValue(String.valueOf(no).charAt(i)))
				        .map(digit->(int)Math.pow(digit, digits))
		                .sum() == no;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		ArmstrongNumberSeven arms =new ArmstrongNumberSeven();
//		if(arms.isArmstrongNumber(scanner.nextInt())) {
//			System.out.println("no is Armstrong No ");
//		}
//		else {
//			System.out.println("no is not armstrong no");
//		}
		
		if(isArmstrongNoByFunctional(scanner.nextInt())) {
			System.out.println("No is armstrong no");
		}
		else {
			System.out.println("no is not armstrong No");
		}
		
	}
	
}
