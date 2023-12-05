package com.javaforall.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreams {

	public static void main(String[] args) {
		
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee("E1", "David",25, "david@gmail.com", 2500.00));
		empList.add(new Employee("E3", "John",22, "john@gmail.com", 3500.00));
		empList.add(new Employee("E4", "Sam",29, "sam@gmail.com", 2100.00));
		empList.add(new Employee("E2", "Lisa",21, "lisa@gmail.com", 2200.00));
		empList.add(new Employee("E5", "Antony",30, "antony@gmail.com", 1900.00));
		empList.add(new Employee("E7", "Dave",25, "dave@gmail.com", 2100.00));
	
		
		//empList.stream().forEach(System.out::println);
		
		//empList.stream().forEach(e -> System.out.println(e));
		
		// filter
		
		// List the employees with salary > 2000
		
		System.out.println("##### Filter operation on list of Objects######");
		List<Employee> empSalFilter = empList.stream().filter(e->e.getSalary()<2000).collect(Collectors.toList());
		empSalFilter.forEach(e -> System.out.println(e));
		

	}

}
