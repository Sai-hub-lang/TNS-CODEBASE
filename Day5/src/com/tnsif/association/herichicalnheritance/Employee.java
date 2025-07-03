package com.tnsif.association.herichicalnheritance;

public class Employee extends Person {
	
	//Data member
	
	private int empId;
	private float salary;
	private String dept;
	
	public Employee() {
		System.out.println("Employee clas default constructor");
		
		empId = 101;
		salary = 22200;
		dept="IT";
	}

	public Employee(int empId, float salary, String dept) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}
	
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", getEmpId()=" + getEmpId()
				+ ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + "]";
	}

	
	
	

}
