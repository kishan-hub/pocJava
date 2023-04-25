package com.demo.OCAJP;

public class Test1 {
	
  int x =10;
  static int y =20;

  public static void main(String[] args) {
	  
	  Test1 t1 =new Test1();
	  t1.x=888;
	  t1.y=999;
	  
	  Test1 t2 =new Test1();
	  
	  System.out.println(t2.x+" ------- "+t2.y);//10 --------- 999
	  
}
}
