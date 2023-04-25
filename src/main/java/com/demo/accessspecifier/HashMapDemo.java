package com.demo.accessspecifier;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapDemo { 
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap =new HashMap<>();
		
		hashMap.put(101, "kishan");
		hashMap.put(102, "Durga");
		hashMap.put(103, "ramesh");
		hashMap.put(104, "gopal");
		hashMap.put(105, "rahul");
		
		Set<Integer> set=hashMap.keySet();
		
		
		List<Integer> intList =hashMap.keySet().stream().limit(4).collect(Collectors.toList());
		
	   intList.forEach(System.out::println);
	     
	  String key ="Alics";
	  
   Map<String, Integer> someMap =new HashMap<>();
   
        someMap.put("Ram", 1);
        someMap.put("shayam", 2);
        someMap.put("krishna",3);
        someMap.put("radha", 4);
        someMap.put("rani", 5);
   
   Set<Map.Entry<String, Integer>> entries =someMap.entrySet();
   
        Set<String> keys=someMap.keySet();
        
        Collection<Integer> values =someMap.values();
        
        Stream<Map.Entry<String, Integer>> entriesStream=entries.stream();
        
        Stream<Integer> valuesStream=values.stream();
        
        Stream<String> keysStream =keys.stream();
        
        keysStream.filter(s->s.length()>5).map(s->s.concat(" ")).collect(Collectors.toList()).forEach(System.out::print);
        
        
        
        
	   
	  
	
		
		
		
	}

}
