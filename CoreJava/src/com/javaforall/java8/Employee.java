package com.javaforall.java8;

public class Employee {
	
	private String eNumber;
	private String eName;
	private Integer eAge;
	private String email;
	private Double salary;
	
	
	public Employee(String eNumber, String eName, Integer eAge, String email, Double salary) {
		super();
		this.eNumber = eNumber;
		this.eName = eName;
		this.eAge = eAge;
		this.email = email;
		this.salary = salary;
	}
	
	public String geteNumber() {
		return eNumber;
	}
	public void seteNumber(String eNumber) {
		this.eNumber = eNumber;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Integer geteAge() {
		return eAge;
	}
	public void seteAge(Integer eAge) {
		this.eAge = eAge;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eNumber=" + eNumber + ", eName=" + eName + ", eAge=" + eAge + ", email=" + email + ", salary="
				+ salary + "]";
	}
	
	
}
