package com.program.s2.core.lang.basic;

public class WrapperClassDemo {

    public static void main(String[] args) {

        // 1. Autoboxing (Primitive → Wrapper Object)
        int a = 20;                 // Primitive data type
        Integer j = a;              // Autoboxing (Java 5+ feature)

        System.out.println("Autoboxing:");
        System.out.println(j);

        System.out.println("-----------------------------------------");

        // 2. Auto-unboxing (Wrapper Object → Primitive)
        Integer ob = 30;            // Wrapper object
        int i = ob;                 // Auto-unboxing

        System.out.println("Auto-unboxing:");
        System.out.println(i);

        System.out.println("-----------------------------------------");

        // 3. String to Integer conversion
        String value1 = "30";
        int output = Integer.parseInt(value1);

        System.out.println("String to Primitive int:");
        System.out.println(output);
    }
}
