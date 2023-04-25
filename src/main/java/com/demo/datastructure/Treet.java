package com.demo.datastructure;

import java.io.Serializable;
import java.util.Date;

public class Treet implements Comparable<Treet>,Serializable {
	
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mAuther;
	 
	 private String mDescription;
	 
	 private Date mCreationDate;

	 public String getmAuther() {
		return mAuther;
	}


	public String getmDescription() {
		return mDescription;
	}


	public Date getmCreationDate() {
		return mCreationDate;
	}
	 
	 public Treet(String mAuther,String mDescription,Date mCreationDate) {
		  this.mAuther=mAuther;
		  this.mDescription=mDescription;
		  this.mCreationDate=mCreationDate;
	 }


	@Override
	public int compareTo(Treet other) {
		// TODO Auto-generated method stub
		if(equals(other)) {
			return 0;	
		}
		else 
		{
			return 1;
		}
	}
	 
 	

}
