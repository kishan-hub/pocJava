package com.demo.datastructure;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture4 {
  
	public static void main(String[] args) {
		
		try
		{
			String s =CompletableFuture.supplyAsync(()-> 23333)
					                   .thenCompose(t ->CompletableFuture.supplyAsync(() -> t + "ddd"))
					                   .get();
			System.out.println(s);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
