package com.demo.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElementOfArraydotEight {
	
	public static void main(String[] args) {
		
		List<Integer> elements = Arrays.asList(10,20,30,10,20,40,60,80,30,40,40,20);
		
		List<Integer> duplicatedElements =findduplicateElementsOfArray(elements);
		
		 duplicatedElements.forEach(System.out::println);
	}
	
	public static List<Integer> findduplicateElementsOfArray(List<Integer> elements){
		
		HashMap<Integer,Integer> hashMap =new HashMap<>();
		List<Integer> duplicatesElements = new ArrayList<>();
		
		for(int element:elements)
		{
			if(hashMap.get(element) == null) {
				hashMap.put(element, 1);
			}
			else
			{
				hashMap.put(element,hashMap.get(element)+1);
			}
		}
		  
		Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
		
		for(Entry<Integer, Integer> entry : entrySet) {

              if(entry.getValue() >1) {
            	  duplicatesElements.add(entry.getValue());
            	  System.out.println("Duplicates element :"+entry.getKey()+" - found "+entry.getValue() +" times");
              }
		}
		return duplicatesElements;
	}

}
