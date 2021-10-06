package com.test.exception;


public class DataOverFlowException extends Exception {
	

	private String message = "범위 초과";
	
	public DataOverFlowException() {}
	
	public String getMessage() {
		return message;
	}
}

