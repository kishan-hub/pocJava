package com.demo.accessspecifier;

import java.sql.Time;
import java.util.Date;

public class A {
	
	private String name="Kishan";
	
	protected String  filename="A";
	
	String date =new Time(1234568568l).toString();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public static void main(String[] args) {
	 A aObject =new A();
	 System.out.println(aObject.name);
	 System.out.println(aObject.filename);
	 System.out.println(aObject.date);
		 
	}

}
