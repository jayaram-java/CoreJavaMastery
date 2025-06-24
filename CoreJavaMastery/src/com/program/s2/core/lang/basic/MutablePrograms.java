package com.program.s2.core.lang.basic;

public class MutablePrograms {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		
		sb.append("Java ");
		sb.append("Programming language");
		
		System.out.println(sb);
		
		// StringBuffer is mutable. synchronized. Performance is low compare to string builder
		
		StringBuilder ob = new StringBuilder();
		
		ob.append("Java ");
		
		ob.append(" has multithreading");
		
		System.out.println(ob);
		
		// Stringbuilder is mutable. non-synchronized. Performance is high compare to string buffer.

	}

}
