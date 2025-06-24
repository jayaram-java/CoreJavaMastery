package com.program.basic;

public class TypeCastingExample {

	public static void main(String[] args) {
		
		int a = 65;
		
		char c = (char)a;
		
		System.out.println(c);
		
		TypeCastingExample ob = new TypeCastingExample();
		
		//ob.narrowing();
		
	//	ob.widening();

	}

	public void widening() {

		// // byte -> short(2) -> int(4) -> long(4) -> float(4) -> double(8)

		int x = 7;
		long y = x;
		float z = y;
		double z1 = z;

		System.out.println("Before conversion, int value = " + x);
		System.out.println("After conversion, long value = " + y);
		System.out.println("After conversion, float value = " + z);
		System.out.println("After conversion, double value = " + z1);

	}

	public void narrowing() {

		double d = 166.66;

		long l = (long) d;

		System.out.println("Before conversion,double value = " + d);

		System.out.println("After conversion, long value =" + l);

	}

}

// Type casting - It is the process of converting one data type to another.

// Implicit - widening

// byte -> short(2) -> int(4) -> long(4) -> float(4) -> double(8)

// Explicit -> narrowing

// double(8) -> float(4) -> long(4) -> int(4) -> short(2) -> byte
