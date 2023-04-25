package com.demo.OCAJP;

public class VArArgsTest {
  
	public static void m1(int...x) {
		System.out.print("var args method executed ");
		int sum=0;
		for(int x1:x) {
			sum+=x1;
		}
		System.out.printf("sum="+sum+"\n");
	}
	
	public static void main(String[] args) {
		
		m1();
		m1(10);
		m1(10,20);
		m1(10,20,30);
		m1(10,20,30,40);
		m1(10,20,30,40,50);
	}
	public static void m2(int x,String ...y) {}
//	public static void m3(int...x,String t) {} 
	
	//public static void m3(int... i,String... y) {}
}
