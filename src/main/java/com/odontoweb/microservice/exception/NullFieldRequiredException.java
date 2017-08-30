package com.odontoweb.microservice.exception;

public class NullFieldRequiredException extends Exception{

	private static final long serialVersionUID = 1447779173498475529L;
	
	private String message;
	private Exception exception;
	
	public NullFieldRequiredException(String message, Exception exception) {
		this.message = message;
		this.exception = exception;
	}
	

	

}
