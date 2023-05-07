package com.demo.logical.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedListExample {
	
	public static void main(String[] args) {
		
		List<String> list =Arrays.asList("JAVA","STRUCTS","JSP","SERVLETS","JSF");
       
		List<String> synchronizedList =Collections.synchronizedList(list);
		
		//you must use synchronized block while iterating over synchronizedList
		
		synchronized(synchronizedList) {
			Iterator<String> it =synchronizedList.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}	
		}
		
	}

}
