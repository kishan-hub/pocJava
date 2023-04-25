package com.demo.datastructure;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFuture2 { 
	
	public static void main(String[] args) {
		
		CompletableFuture<Integer> uCompleteableFuture =CompletableFuture.supplyAsync(() -> {
			System.out.println("Welcome");
			
			try
			{
				TimeUnit.SECONDS.sleep(3);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			int a =1/0;
			System.out.println("last");
			return 2333;
		});
		
		try
		{
		  Integer result =uCompleteableFuture.whenComplete((a,b) -> {
                System.out.println("Result: "+a);
                System.out.println("Exception: "+b);
		  }).exceptionally(e->{
			  System.out.println(e.getMessage());
			  return 666;
		  }).get();
		  System.out.println(result);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (ExecutionException e2) {
			e2.printStackTrace();
		}
	}

}
