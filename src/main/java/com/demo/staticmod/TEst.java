package com.demo.staticmod;

import com.demo.constructor.Test;

public class TEst {
	static int count=0;
	{
		count++;
	}
	
	TEst(){
     	System.out.println(this.hashCode());
	}
	
	TEst(int i){
		System.out.println(this.hashCode()+i);
	}
	
	TEst(double d){
		System.out.println(this.hashCode()+d);
	}
	
	@Override
	public String toString() {
		System.out.println(new TEst());
		return "";
	}
	
  public static void main(String[] args) {
         TEst t1 =new TEst(10);
           System.out.println(t1); 
  }
}
