package com.program.s4.util.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	int id;
	String name;
	int salary;

	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}
}

public class ComparatorSalaryExample {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Ravi", 50000));
		list.add(new Employee(2, "Anu", 30000));
		list.add(new Employee(3, "Kumar", 70000));
		

        Comparator<Employee> salaryComparator =
                (e1, e2) -> e1.salary - e2.salary;

        Collections.sort(list, salaryComparator);

        list.forEach(System.out::println);
        
        Comparator<Employee> nameComparator =
                (e1, e2) -> e1.name.compareTo(e2.name);

        Collections.sort(list, nameComparator);
        
       // list.forEach(System.out::println);

	}

}

//Use Comparator
//→ When you need multiple sorting options (salary, name, date, etc.)
