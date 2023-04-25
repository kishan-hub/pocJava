package com.demo.datastructure;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ComplettableFuture7 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		 CompletableFuture.supplyAsync(() -> {
	            try {
	                System.out.println("Run1");
	                TimeUnit.SECONDS.sleep(3);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            return 9999;
	        }).thenRun(() -> {
	            System.out.println("Run2");
	        }).get();
	    }
	}

