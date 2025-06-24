package com.program.s2.core.lang.exception;

public class Voter {

	public void checkEligibility(int age) throws InvalidVoterException,NullPointerException,ArrayIndexOutOfBoundsException {

		if (age < 18) {

			throw new InvalidVoterException("Voter is not eligible to vote. Age must be 18 or elder");

		} else {
			System.out.println("Voter is eligible to vote");
		}

	}

	public static void main(String[] args) {
		
		Voter ob  = new Voter();
		
		try {
			ob.checkEligibility(15);
		} catch (InvalidVoterException e) {
			
			e.printStackTrace();
		}

	}

}
