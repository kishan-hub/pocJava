package com.demo.array;

import java.util.Arrays;

public class SearchBinaryDemo {
	
	
	public static int binarySearch(int[] a, int fromIndex, int toIndex,
            int key) {
		
		    int low = fromIndex;
	        int high = toIndex - 1;

	        while (low <= high) {
	            int mid = (low + high) >>> 1;
	            int midVal = a[mid];

	            if (midVal < key)
	                low = mid + 1;
	            else if (midVal > key)
	                high = mid - 1;
	            else
	                return mid; // key found
	        }
	        return -(low + 1);  // key not found.

	}
	public static void main(String[] args) {
		int [] newArray = {10,20,30,15,23,65,5,20,35,67};
	    
		Employee e1 =new Employee(1,"sudhanshu", 20000);
		
		int hashcodeE1=e1.hashCode();
		
		Employee e2=new Employee(2,"purshottam",30000);
		int hashcodeE2 =e2.hashCode();
		
		Employee e3=new Employee(3,"rahul", 30000);
		int hashcodeE3 =e3.hashCode();
		
		Employee e4 =new Employee(4, "durga",40000);
		int hashcodeE4 =e4.hashCode();
		
		Object [] employees = {e1,e2,e3,e4};
		
		Object[] employeesHashcode = {hashcodeE1,hashcodeE2,hashcodeE3,hashcodeE4};
		
		int findIndex = binarySearch(newArray, 0, newArray.length-1, 5);
		
		System.out.println(findIndex);
		
		
	    //stream uses 
		Arrays.stream(newArray).map(i->i).forEach(i->System.out.print(i+" "));
		
		System.out.println();
		
		//convert into string
		System.out.println(java.util.Arrays.toString(newArray));
		
		//usese of deep hashCode
		int hashcode=Arrays.deepHashCode(employees);
		
		System.out.println(hashcode);
		
		int employeeshashcodes =Arrays.deepHashCode(employeesHashcode);
		
		System.out.println(employeeshashcodes);
		
	}

}
