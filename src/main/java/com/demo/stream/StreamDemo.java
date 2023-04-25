package com.demo.stream;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDemo {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		
		System.out.println("Original list "+myList);
		
		//obtain the stream to ArrayList
		
//		Stream<Integer> myStream =myList.stream();
//		
//		System.out.println(myStream.map(i->i%2 ==0).collect(Collectors.toList()));
//		
//		//obtain the min and max value
//		Optional<Integer> minVal =myStream.min(Integer::compare);
//		
//		System.out.println(minVal.get());
//		
//		Optional<Integer> maxVal=myStream.max(Integer::compare);
//		
//		System.out.println(maxVal.get());
//		
//		System.out.println(myStream);
		
		//display only odd value in list
		
		List<Integer> integer = myList.stream().sorted().filter(n->(n%2)==1).collect(Collectors.toList());
		  
		System.out.println(integer);
		
		
	}

}
