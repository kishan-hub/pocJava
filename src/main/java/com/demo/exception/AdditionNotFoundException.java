package com.demo.exception;

public class AdditionNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public AdditionNotFoundException(String message) {
		this.message=message;
	}
	

}
