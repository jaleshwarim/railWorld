package com.test;

public class Employee {
	
	  public int empId;
	  public String empName;
	  public String empAge;
	   
   

   public Employee(int empId, String empName, String empAge) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empAge = empAge;
   }
   
      String info() {
	    return this.empId+" "+this.empName+" "+this.empAge;
       }
      

}
