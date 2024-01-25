package com.qsp.demostudent.exception;

public class ObtainMarkNotFound extends RuntimeException{

	String message;
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
	public ObtainMarkNotFound(String message) {
		super();
		this.message = message;
	}
	
}
