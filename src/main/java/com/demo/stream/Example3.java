package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
  
	public static void main(String[] args) {
		
		List<String> words  =Arrays.asList("Java 8","Lamdas11","In","Action");
		  
		words.stream().filter(word->word.length()>6).collect(Collectors.toList()).forEach(i->System.out.println(i));
	
		
	}
}
