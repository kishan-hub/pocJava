package com.demo.array;

import java.util.Arrays;

public class ArrayCopyOfDemo {
	
	public static void main(String[] args) {
		
		String[] copyForm = {
				 "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
		            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
		            "Marocchino", "Ristretto" 
		};
		
		String[] copyTo= Arrays.copyOfRange(copyForm, 2, 9);
		
		for(String coffee : copyTo) {
			System.out.print(coffee+" ");
		}
	}

}
