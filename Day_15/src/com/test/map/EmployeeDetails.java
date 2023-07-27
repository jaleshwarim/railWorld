package com.test.map;

import java.util.Objects;

public class EmployeeDetails {
	
	private int empId;
	private double empSal;
	private long phoneNo;
	private String addr;
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDetails(int empId, double empSal, long phoneNo, String addr) {
		super();
		this.empId = empId;
		this.empSal = empSal;
		this.phoneNo = phoneNo;
		this.addr = addr;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", empSal=" + empSal + ", phoneNo=" + phoneNo + ", addr=" + addr
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(addr, empId, empSal, phoneNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDetails other = (EmployeeDetails) obj;
		return Objects.equals(addr, other.addr) && empId == other.empId
				&& Double.doubleToLongBits(empSal) == Double.doubleToLongBits(other.empSal) && phoneNo == other.phoneNo;
	}

	
}
