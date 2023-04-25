package com.demo.singleton;

public class SingletonDemo {
	
	public static void main(String[] args) {
		
//		CurrencyConvertor cc1 =CurrencyConvertor.getObject();
//		CurrencyConvertor cc2 =CurrencyConvertor.getObject();
//		
//		System.out.println("cc1 == cc2: ?"+(cc1==cc2));
		
		
		Runnable runnable = ()->{
			    
			CurrencyConvertor cc1 =CurrencyConvertor.getObject();
			System.out.println(cc1.hashCode()+"\t"+Thread.currentThread().getName());
		};
		
		Thread t1 =new Thread(runnable);
		Thread t2 =new Thread(runnable);
		t1.start();
		t2.start();
	}

}
