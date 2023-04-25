package com.demo.singleton;

import java.io.Serializable;

public class CurrencyConvertor implements Cloneable,Serializable{
	
	private static final long serialVersionUID = -6486979528301987590L;
	private static CurrencyConvertor object;
	
	private CurrencyConvertor() {
		//No -op
	}
	
	public static CurrencyConvertor getObject() {
	    
		if(object ==null) {
		   synchronized (CurrencyConvertor.class) {
				 if(object == null) {
					 object = new CurrencyConvertor();
				 }	
		}	
	 }		 
		 return object;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
	    throw new CloneNotSupportedException("cloaning Not Supported");
	}
	
}
