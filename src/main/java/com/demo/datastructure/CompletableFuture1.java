package com.demo.datastructure;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture1 {
	
	private static CompletableFuture<Void> helloFuture;
	
	private static CompletableFuture<Integer> integerCompletableFuture;

	public static void main(String[] args) {
		helloFuture = CompletableFuture.runAsync(()-> System.out.println("hello future"));
		
		integerCompletableFuture =CompletableFuture.supplyAsync(() ->2333);
		
		System.out.println(integerCompletableFuture.getNumberOfDependents());
	}

}
