package com.demo.threading;

public class SynchronizedMethod {
	 
	 public static void main(String[] args) throws InterruptedException {
		InventoryCounter inventoryCounter = new InventoryCounter();
		IncrementThread incrementThread =new IncrementThread(inventoryCounter);
		DecrementThread decrementThread =new DecrementThread(inventoryCounter);
	   
		incrementThread.start();
		decrementThread.start();
		
		incrementThread.join();
		decrementThread.join();
		
		 System.out.println("We currently have " + inventoryCounter.getItems() + " items");
	}
	
	
	public static class DecrementThread extends Thread
	{
		private InventoryCounter inventoryCounter;
		
		public DecrementThread(InventoryCounter inventoryCounter) {
			this.inventoryCounter=inventoryCounter;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<10000;i++) {
				inventoryCounter.decremenet();
			}
		}
	}
	
	public static class IncrementThread extends Thread
	{
		private InventoryCounter inventoryCounter;
		
		public IncrementThread(InventoryCounter inventoryCounter) {
			this.inventoryCounter=inventoryCounter;
		}
		
		public void run() {
			
			for(int i=0;i<10000;i++) {
				inventoryCounter.increment();
			}
		}
	}
	
	private static class InventoryCounter
	{
		
		private int items =0;
		
		Object lock =new Object();
		
		public void increment() {
			
			synchronized (this.lock) {
				items++;
			}
		}
		
		public void decremenet() {
			synchronized (this.lock) {
				items--;
			}
		}
		
		public int getItems() {
			synchronized (this.lock) {
				return items;
			}
		}
	}

}
