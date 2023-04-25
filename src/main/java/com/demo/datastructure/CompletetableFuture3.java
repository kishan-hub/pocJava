package com.demo.datastructure;

import java.util.concurrent.CompletableFuture;

public class CompletetableFuture3 {
	
	public static void main(String[] args) {
		
		try {
			
			String result =CompletableFuture.supplyAsync(()->2333).thenApply(String::valueOf).get();
			
			System.out.println(result);
			System.out.println(result.getClass());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
