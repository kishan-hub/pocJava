package com.demo.accessspecifier;

public class B {
  
		
		 public static void main(String []args)
	     {
	         int[] arr={1,2,2,3,4,4,4,5,5};
	          
	         int [] arr1= new int[arr.length];
	         
	         for(int i=0;i<arr.length;i++)
	         {
	              for(int j=i+1;j<arr.length;j++)
	              {
	                  if(arr1[i] ==arr[j])
	                     continue;
	            
	                    arr1[i]=arr[i];
	              }     
	         }
	         
	         for(int i=0;i<arr1.length;i++) {
	        	 
	        	 System.out.print(arr1[i]);
	         }
	     }
}
