package com.program.s4.util.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapHashCodeDemo {

	public static void main(String[] args) {

		String key1 = "FB";
		String key2 = "Ea";

		System.out.println("HashCode of FB : " + key1.hashCode());
		System.out.println("HashCode of Ea : " + key2.hashCode());

		Map<String, String> map = new HashMap<>();

		map.put(key1, "First Value");
		map.put(key2, "Second Value");

		System.out.println("\nHashMap contents:");
		map.forEach((k, v) -> System.out.println(k + " -> " + v));

	}

}

//two different objects (keys) can have the same hashCode() in Java.
//This situation is called a hash collision.

//HashCode → house number

//equals() → person’s name

// Both entries stored in the same bucket


//Collision handling:

//Java 7 → LinkedList

//Java 8+ → LinkedList → Red-Black Tree


//HashMap
//└── Node<K,V>[] table   → Array
//       ├── index 0 → null
//       ├── index 1 → Node → Node → Node   (LinkedList)
//       ├── index 2 → Node → Node → Node   (Red-Black Tree*)

