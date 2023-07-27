package com.test.map;
import java.lang.*;
import java.util.Objects;

public class Employee implements Comparable{
	
	private int empId;
	private String Name;
	private String lName;
	public Employee(int empId, String name, String lName) {
		super();
		this.empId = empId;
		Name = name;
		this.lName = lName;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Name=" + Name + ", lName=" + lName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Name, empId, lName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Name, other.Name) && empId == other.empId && Objects.equals(lName, other.lName);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
//		if(this.getlName()>o.)
		return 0;
	}
	

}
