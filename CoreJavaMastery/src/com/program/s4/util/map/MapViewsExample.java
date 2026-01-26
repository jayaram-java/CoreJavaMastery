/**
 * 
 */
package com.program.s4.util.map;
import java.util.*;

public class MapViewsExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Arun");
        map.put(102, "Bala");
        map.put(103, "Charan");

        // 1. keySet()
        Set<Integer> keys = map.keySet();
        System.out.println("Keys:");
        for (Integer key : keys) {
            System.out.println(key);
        }

        // 2. values()
        Collection<String> values = map.values();
        System.out.println("\nValues:");
        for (String value : values) {
            System.out.println(value);
        }

        // 3. entrySet()
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("\nEntries (Key-Value pairs):");
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
