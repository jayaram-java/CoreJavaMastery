package com.program.s6.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WithoutLambdaDemo {

	public static void main(String[] args) {

		try {

			List<Employee> employees = new ArrayList<>();

			employees.add(new Employee("Diya", 60000));
			employees.add(new Employee("Arun", 45000));
			employees.add(new Employee("Meena", 70000));
			employees.add(new Employee("Karan", 30000));

			System.out.println("All Employees");
			for (Employee emp : employees) {

				System.out.println(emp);

			}

			System.out.println("Employee with salary > 50000");
			for (Employee emp : employees) {
				if (emp.getSalary() > 50000) {
					System.out.println(emp);
				}

			}

			System.out.println("Employees sorted by name:");

			Collections.sort(employees, new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {

					return o1.getName().compareTo(o2.getName());
				}

			});

			for (Employee emp : employees) {

				System.out.println(emp);

			}

		} catch (Exception e) {

		}

	}

}
