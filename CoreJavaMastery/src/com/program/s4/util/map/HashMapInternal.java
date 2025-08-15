package com.program.s4.util.map;

import java.util.HashMap;

class Key {

	String key;

	public Key(String key) {
		super();
		this.key = key;

		System.out.println("Key =" + key);
		
	
	}

	@Override
	public int hashCode() {
		int hash = key.charAt(0); // Simplified hash for demonstration
		System.out.println("hashCode() called for key: " + key + " => " + hash);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {

		System.out.println("Equals = " + ((Key) obj).key);

		return key.equals(((Key) obj).key);
	}

}

public class HashMapInternal {

	public static void main(String[] args) {

		HashMap<Key, Integer> map = new HashMap<>();

		map.put(new Key("Indonasia"), 5);
		map.put(new Key("India"), 1); // Hashcode will be called
		map.put(new Key("Canada"), 2);

		System.out.println("Retrieving value for key 'India'");
		Integer value = map.get(new Key("India")); // // hashCode + equals will be called
		System.out.println("Value = " + value);
		
		// Each [Key=Value] is a Node

	}

}
