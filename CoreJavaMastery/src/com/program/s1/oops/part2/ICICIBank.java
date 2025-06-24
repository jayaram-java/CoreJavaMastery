package com.program.s1.oops.part2;

public class ICICIBank implements DebitCard,Creditcard{
	
	@Override
	public void cardName() {
		
		System.out.println("ICICI bank related logic");
	}

	@Override
	public void balanceCheck() {
		
		
	}
	
	@Override
	public void creditPoints() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkCreditCardBalance() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		ICICIBank ob = new ICICIBank();
		
		ob.cardName();


	}

	



}
