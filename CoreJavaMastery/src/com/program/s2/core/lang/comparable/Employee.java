package com.program.s2.core.lang.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	int salary;

	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee e) {

		return this.salary - e.salary; // ascending order
	}
	
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Ravi", 50000));
		list.add(new Employee(2, "Anu", 30000));
		list.add(new Employee(3, "Kumar", 70000));

		Collections.sort(list); // uses compareTo()

		list.forEach(e -> System.out.println(e.salary));

	}

}

//Use Comparable
//→ When there is one natural way to sort (salary, id)
