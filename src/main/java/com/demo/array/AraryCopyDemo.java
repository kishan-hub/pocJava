package com.demo.array;


public class AraryCopyDemo {
  
   public static void main(String[] args) {
	
		 String [] copyform= {
				 "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
		         "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
		          "Marocchino", "Ristretto"	 
		 };
		 String [] copyTo =new String[10];
        
		 System.arraycopy(copyform, 0, copyTo, 0, 10);
		 
		 for(String coffee: copyTo) {
			 System.out.print(coffee+" ");
		 }
}
   
	
}
