package com.program.s4.util.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

		map.put(1, "Java");
		map.put(2, "Spring");

		// Thread-safe update
		map.putIfAbsent(2, "Boot");

		// Atomic operation
		map.compute(1, (k, v) -> v + " 8");

		System.out.println(map);
	}

}

/*ConcurrentHashMap is a thread-safe map that allows concurrent read and write operations by locking only 
a portion of the map (bucket-level), improving performance compared to Hashtable.*/
