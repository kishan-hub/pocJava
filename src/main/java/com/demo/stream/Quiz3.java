package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz3 {
  
	private static void q1() {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		//find the square of the given numbers
		List<Integer> squareNumbers= numbers.stream().map(i->i*i).collect(Collectors.toList());
	     
		squareNumbers.forEach(i->System.out.print(i+"  "));

		
	}
	
	private static void q2()
	{
		List<Integer> numbers1=Arrays.asList(1,2,3);
		List<Integer> numbers2=Arrays.asList(3,4);
		
		List<int[]>pairs=numbers1.stream().flatMap(i->numbers2.stream().map(j->new int[] {i,j}))
		                 .collect(Collectors.toList());
		 pairs.forEach(pair -> System.out.println(Arrays.toString(pair)));
	}
	
	private static void q3()  
	{
	    List<Integer> numbers1= Arrays.asList(1,2,3);
	    List<Integer> numbers2=Arrays.asList(3,4);
	    
	    List<int[]>pairs =numbers1.stream().flatMap(i->numbers2.stream().filter(j->(i+j)% 2 ==1).map(j-> new int[] {i,j}))
	    		                   .collect(Collectors.toList());
	        pairs.forEach(pair ->System.out.println(Arrays.toString(pair)));
	    		                   
	    
	}
	
	public static void main(String[] args) {
	//   q2();
	 //  q1();
		q3();
	}
}
