package com.javaforall.comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorService {

	public static void main(String[] args) {

		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(3);
		integerList.add(2);
		integerList.add(1);
		integerList.add(2);
		integerList.add(5);
		
		for(Integer i: integerList) {
			System.out.print(i+" ");
		}
		
		
		Collections.sort(integerList);
		
		System.out.println();
		
		System.out.println("List after sorting");
		
		for(Integer i: integerList) {
			System.out.print(i+" ");
		}
		
		// Employee List
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(2,"John",21,"Jersy City"));
		empList.add(new Employee(3,"David",29,"Exchange Place"));
		empList.add(new Employee(1,"Lucy",26,"New York"));
		empList.add(new Employee(7,"Andrew",27,"Texas"));
		empList.add(new Employee(4,"Simon",25,"Heights"));
		
		System.out.println("######## Employee List ##########");
		// Object class is the super class of all the classes in Java
		printEmpList(empList);
		
		//Collections.sort(empList, new EmployeeNameComparator()); // By Using Comparator Class Interface
		
		//Collections.sort(empList,addressComparator);	// Anonymous inner class Comparator	
		
		/*
		 * Collections.sort(empList,new Comparator<Employee>() { public int
		 * compare(Employee emp1, Employee emp2) { return
		 * emp1.getEmpName().compareTo(emp2.getEmpName()); } });
		 */
		
		empList.sort(Comparator.comparing(Employee::getEmpName));
		
		
		System.out.println("### Employee List after sorting with Comparable interface");
		
		printEmpList(empList);
		
		// Comparable and Comparator interfaces
		
		//[1,3, 5,7]  [6,7,8]    --- [1,3,5,7,6,7,8]
		
		//Arrays.sort(null);
		
		// [1,3,5,6,7,7,8]
		
	}
	
	
	public static Comparator<Employee> addressComparator = new Comparator<>() {
		public int compare(Employee emp1, Employee emp2) {
			return emp1.getEmpAddress().compareTo(emp2.getEmpAddress());
		}
	};
	
	public static void printEmpList(List<Employee> empList) {
		for(Employee emp:empList) {
			System.out.println(emp);
		}
	}
	

}
