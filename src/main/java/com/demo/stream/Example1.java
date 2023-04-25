package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {
   
	public static void main(String[] args) {
		
		List<String> list =Arrays.asList("hello","world");
		
		Stream<String> stream =list.stream();
		
		Stream<String> stringStream =Arrays.stream(new String[] {"hello","world"});
      
		Stream<String> stream1 =Stream.of("hello","World");
		
	}
}
