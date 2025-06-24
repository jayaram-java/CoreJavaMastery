package com.program.s1.oops.part2;

public class SBIBank implements DebitCard {
	
	@Override
	public void cardName() {
		
		System.out.println("SBI debit card related logic");
		
	}

	@Override
	public void balanceCheck() {
		System.out.println("It will invoke the database with accountnumber");
		
		
	}

	public static void main(String[] args) {

		SBIBank ob = new SBIBank();
		
		ob.cardName();
	}

	

}
