package com.program.s6.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class WithLambdaDemo {

	public static void main(String[] args) {

		try {

			List<Employee> employees = new ArrayList<>();

			employees.add(new Employee("Diya", 60000));
			employees.add(new Employee("Arun", 45000));
			employees.add(new Employee("Meena", 70000));
			employees.add(new Employee("Karan", 30000));

			System.out.println("All Employees");
			//(parameter) -> expressions
			employees.forEach(emp -> System.out.println(emp));
			
			System.out.println("Employee with salary > 50000");
			
			employees.stream().filter(emp -> emp.getSalary() > 50000).forEach(emp -> System.out.println(emp));
			
			System.out.println("Employees sorted by name:");
			
			employees.stream().sorted((o1,o2) -> o1.getName().compareTo(o2.getName())).forEach(emp -> System.out.println(emp));

		} catch (Exception e) {

		}

	}

}
