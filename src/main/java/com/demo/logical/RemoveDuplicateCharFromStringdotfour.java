package com.demo.logical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateCharFromStringdotfour {
	
	
	 public static void main(String[] args) {
		 
		 String str ="welcometoJavaanddevposprogramminglanguage";
		 
		 List<String> findDuplicateCharacter =removeDuplicateCharacterFromString(str);
		 
		 findDuplicateCharacter.forEach(System.out::println);
		
	}
	
	public static List<String> removeDuplicateCharacterFromString(String string) {
		
		
		Map<Character,Integer> hashMap  = new HashMap<>();
		
		 //conert the string charArary
		char[] charArray = string.toCharArray();
		
		
		for(char ch :charArray) {
			
			if(hashMap.containsKey(ch)) {
				hashMap.put(ch,1);
			}
			else
			{
				 hashMap.put(ch, hashMap.get(ch)+1);
			}
		}
		Set<Entry<Character, Integer>> entryset =hashMap.entrySet();
		List<String> listString =new ArrayList<>();
		for(Entry<Character, Integer> entry : entryset) {

            if(entry.getValue() >1) {
          	     String str ="Duplicates element :"+entry.getKey()+" - found "+entry.getValue() +" times";
          	     listString.add(str);
          	  //System.out.println("Duplicates element :"+entry.getKey()+" - found "+entry.getValue() +" times");
            }
		}
		return listString;
	}

}
