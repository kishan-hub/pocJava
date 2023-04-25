package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
	
	public static void main(String[] args) {
		 
		List<String> list =Arrays.asList("i am a boy","I love the girl","But the girl loves another boy");
		
	List<String> newList=	list.stream()
		        .map(w->w.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
		
	  System.out.println(newList);
	}

}
