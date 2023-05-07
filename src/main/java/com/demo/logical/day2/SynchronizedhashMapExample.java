package com.demo.logical.day2;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class SynchronizedhashMapExample {
  
	public static void main(String[] args) {
		
		HashMap<String, Integer> map =new HashMap<>();
		map.put("one", 1);
		map.put("two",2);
		map.put("three",3);
		map.put("four",4);
		
		//geting SynchronizedMap 
		
		Map<String,Integer> synchronizedMap =Collections.synchronizedMap(map);
		
		System.out.print("values.............");
		
		Collection<Integer> values =synchronizedMap.values();
		
		synchronized (synchronizedMap) {
			 Iterator<Integer> it =values.iterator();
			 
			 while(it.hasNext()) {
				 
				 System.out.print(it.next()+"  ");
			 }
		}
		
	}
}
