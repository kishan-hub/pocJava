package com.demo.stream;

import java.util.Arrays;

public class ArraysStream {
	
	public static void main(String[] args) {
		
		//Arrays.stream( new double[] {3.14159,2.718,1.618 }).forEach(n->System.out.format("%f",n));
		
		System.out.println();
		//Arrays.stream(new int[] {1,3,5}).forEach(n->System.out.format("%d\t",n));
		
		//Arrays.stream(new long[] {11,22,44,66 }).forEach(n->System.out.format("%d",n));
		
		System.out.println();
		
		//Arrays.stream(new Object[] {new Example1(),new Example2(),new Example3()}).forEach(example-> System.out.println(example));
		Arrays.stream(new long[] {1,3,5,7,15,28,37 },3,6).forEach(l->System.out.format("%d",l));
		
		
	}

}
