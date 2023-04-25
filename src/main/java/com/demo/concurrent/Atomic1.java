package com.demo.concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Atomic1 {
	
	private static final int NUM_INCREMENTS =1000;
	
	private static AtomicInteger atomicInt =new AtomicInteger(0);
	
	
	 public static void main(String[] args) {
		 testIncrement();
		 
	}
	 
	 private static void testIncrement() {
		 atomicInt.set(0);
		 ExecutorService executer =Executors.newFixedThreadPool(2);
		 
		 IntStream.range(0, NUM_INCREMENTS)
		          .forEach(i ->executer.submit(atomicInt::incrementAndGet));
		 
		executer.shutdown();
		
		System.out.format("Increment: Expected=%d; Is=%d\n",NUM_INCREMENTS, atomicInt.get());
	 } 
}
