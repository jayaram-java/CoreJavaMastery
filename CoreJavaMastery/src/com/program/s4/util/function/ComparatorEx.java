/**
 * 
 */
package com.program.s4.util.function;

import java.util.List;

// Comparator – sorted()
// Used for custom sorting
public class ComparatorEx {

	public static void main(String[] args) {

		List<Employee> employees = List.of(new Employee(50000), new Employee(30000), new Employee(70000));

		employees.stream().sorted((e1, e2) -> e1.salary - e2.salary) // Comparator<T>
				.forEach(e -> System.out.println(e.salary));

	}

}

class Employee {
	int salary;

	Employee(int salary) {
		this.salary = salary;
	}
}

// Method: int compare(T o1, T o2)