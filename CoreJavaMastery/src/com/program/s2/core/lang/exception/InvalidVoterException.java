package com.program.s2.core.lang.exception;

// checked exception(compile time) - IOException, SQLException - custom exception
public class InvalidVoterException extends Exception {

	public InvalidVoterException(String message) {
		super(message);
		
	}
	
}
