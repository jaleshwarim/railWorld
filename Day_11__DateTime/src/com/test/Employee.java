package com.test;

import java.sql.Date;

public class Employee {
	
	public int empId;
	public String empName;
	public Date date;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", date=" + date + "]";
	}


	

	public Employee(int empId, String empName, Date date) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.date = date;
	}
	
	
	

}
