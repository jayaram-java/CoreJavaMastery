package com.program.s2.core.lang.exception;

// unchecked exception(run time) - custom exception
public class InvalidVoterException extends RuntimeException {

	public InvalidVoterException(String message) {
		super(message);
		
	}
	
}
