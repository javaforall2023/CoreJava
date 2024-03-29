package com.javaforall.comparators;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}

}
