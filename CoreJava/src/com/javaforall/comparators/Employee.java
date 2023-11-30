package com.javaforall.comparators;

public class Employee implements Comparable<Employee>{
	
	private Integer empNo;
	private String empName;
	private Integer empAge;
	private String empAddress;
	
	public Employee(Integer empNo, String empName, Integer empAge, String empAddress) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empAge = empAge;
		this.empAddress = empAddress;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empAge=" + empAge + ", empAddress=" + empAddress
				+ "]";
	}

	@Override
	public int compareTo(Employee emp1) {
		// TODO Auto-generated method stub
		return this.empNo - emp1.getEmpNo();
	}
		

}
