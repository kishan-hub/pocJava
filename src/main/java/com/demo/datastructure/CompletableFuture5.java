package com.demo.datastructure;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture5 {
	
	public static void main(String[] args) throws ExecutionException,InterruptedException {
		 
		CompletableFuture.supplyAsync(()->9999)
		                 .thenAccept(System.out::println).get();
	}

}
