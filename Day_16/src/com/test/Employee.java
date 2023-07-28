package com.test;

public class Employee {
	
	private int empId;
	private String empName;
	private double empSal;
	private long empPhone;

	Employee(){
		
	}

	public Employee(int empId, String empName, double empSal, long empPhone) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empPhone = empPhone;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public long getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(long empPhone) {
		this.empPhone = empPhone;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empPhone=" + empPhone
				+ "]";
	}
	
}
