package com.test;

import java.util.Objects;

public class StringClass {
	
	private int  empId;
	private  String empName;
	private int empAge;
	private String empGender;
	private int empSal;
	private String empDep;
	
	
	public StringClass(int empId, String empName, int empAge, String empGender, int empSal, String empDep) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empGender = empGender;
		this.empSal = empSal;
		this.empDep = empDep;
	}
//	public boolean StringClass() {
//		super();
//		
//		 StringClass sc=new StringClass();
//		if(this.empId==sc.empId) {
//			if(this.empName.equals(sc)) {
//				if(this.empAge==sc.empId) {
//					return true;
//				}
//			}
//		}
//	}


	@Override
	public int hashCode() {
		return Objects.hash(empAge, empDep, empGender, empId, empName, empSal);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringClass other = (StringClass) obj;
		return empAge == other.empAge && Objects.equals(empDep, other.empDep)
				&& Objects.equals(empGender, other.empGender) && empId == other.empId
				&& Objects.equals(empName, other.empName) && empSal == other.empSal;
	}
	
	
	
	
	
	
	
	

}
