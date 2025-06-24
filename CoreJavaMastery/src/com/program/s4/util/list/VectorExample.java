package com.program.s4.util.list;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<String> ob = new Vector<String>();
		
		ob.add("India");
		ob.add("America");
		ob.add("China");
		ob.add("England");
		
		System.out.println("Vector result :"+ob);
		
		// vector is synchronized
		// It is slow as it is thread safe
		
		

	}

}
