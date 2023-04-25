package com.demo.threading;

import java.util.Random;

import javax.lang.model.type.IntersectionType;

public class DeadLocks {
	
	
	public static void main(String[] args) {
		
		Intersection intersection  = new Intersection();
		
		Thread trainAThread  = new Thread(new TrainA(intersection));
		
		Thread trainBThread = new Thread(new TrainB(intersection));
		trainAThread.start();
		trainBThread.start();
		
		
	}
	
	public static class TrainA implements Runnable
	{
		private Intersection intersection;
		private Random random = new Random();
		
		public TrainA(Intersection intersection) {
			this.intersection =intersection;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			long end =System.currentTimeMillis();
		   try
		   {
			   Thread.sleep(5);
		   }
		   catch (InterruptedException e) {
			// TODO: handle exception
			   e.printStackTrace();
		  }
		   intersection.takeRoadA();
		   long start =System.currentTimeMillis();
		   System.out.println("Total Time Duration in TrainA "+(end - start)+" ms");
		 
		}
		
	}
	
	public static class TrainB implements Runnable
	{
		
		private Intersection intersection;
		
		private Random random =new Random();
		
		public TrainB(Intersection intersection) {
			this.intersection =intersection;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			long end =System.currentTimeMillis();
			try
			{
				Thread.sleep(5);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			intersection.takeRoadB();
			long start = System.currentTimeMillis();
			System.out.println("Total time duration in TrainB "+(end - start)+" ms");
		}
		
	}
	
	public static class Intersection
	{
		private Object roadA =new Object();
		private Object roadB =new Object();
		
		public void takeRoadA()
		{
			synchronized (roadA) {
			System.out.println("Road A is locked by Thread "+ Thread.currentThread().getName());
				  
		}
			
             synchronized (roadB) {
			 System.out.println("Train is passing through road A");
			 try
			 {
				 Thread.sleep(1);
			 }
			 catch (Exception e) {
				// TODO: handle exception
			}
			}
		}
		
		public void takeRoadB()
		{
			   synchronized (roadB) {
	                System.out.println("Road B is locked by thread " + Thread.currentThread().getName());

	                synchronized (roadA) {
	                    System.out.println("Train is passing through road B");

	                    try {
	                        Thread.sleep(1);
	                    } catch (InterruptedException e) {
	                    }
	                }
	            }
		}
	}

}
