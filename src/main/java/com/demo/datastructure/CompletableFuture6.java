package com.demo.datastructure;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture6 {
  
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture.supplyAsync(() -> 99999)
		                 .thenAcceptBoth(CompletableFuture.supplyAsync(()-> "7878"), (a,b) ->{
		                	 System.out.println("a= "+a);
		                	 System.out.println("b = "+b);
		                 }).get();
	}
}
