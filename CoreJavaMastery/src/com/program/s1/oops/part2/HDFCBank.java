package com.program.s1.oops.part2;

public class HDFCBank implements OnlineBanking {

	private double balance = 10000.0;

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: ₹" + amount);

	}

	@Override
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: ₹" + amount);
		} else {
			System.out.println("Insufficient funds.");
		}

	}

	@Override
	public void transferFunds(String toAccount, double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Transferred ₹" + amount + " to account: " + toAccount);
		} else {
			System.out.println("Insufficient balance for transfer.");
		}

	}

	public static void main(String[] args) {
		
		HDFCBank ob = new HDFCBank();
		
		ob.deposit(20000.0);

	}

}
