package com.test;

public class Employee {
	
	
	int empid= 1001;
	  String empname= "Rahul";
	  double empsal= 886869;
	  String empaddr="hyd";
	  
	  
	  
	//static vraiable
	 static int empid1= 1002;
	 static String empname1= "Rahul kumar";
	 static double empsal1= 886869;
	 static String empaddr1="bsp";
	
	 

	  int empid2;
	  String empname2;
	  double empsal2;
	  String empaddr2;
	  //Employee has Pincode
	  Pincode pincode;
	  
	  public void display() {
		  System.out.println("Employee Details");
	       System.out.println("================");
	       System.out.println("Emplyoyee Id: "+empid);
	       System.out.println("Emplyoyee Name: "+empname);
	       System.out.println("Emplyoyee Salrary: "+empsal);
	       System.out.println("Emplyoyee Address: "+empaddr);
	  
	  }
	  public static void display1() {
		  System.out.println("Employee Details2");
	       System.out.println("================");
	       System.out.println("Emplyoyee Id: "+empid1);
	       System.out.println("Emplyoyee Name: "+empname1);
	       System.out.println("Emplyoyee Salrary: "+empsal1);
	       System.out.println("Emplyoyee Address: "+empaddr1);
	  
	  }
	  
	  //can not make a static refrence ro the non static varaiables
//	  public static void display2() {
//		  System.out.println("Employee Details");
//	       System.out.println("================");
//	       System.out.println("Emplyoyee Id: "+empid);
//	       System.out.println("Emplyoyee Name: "+empname);
//	       System.out.println("Emplyoyee Salrary: "+empsal);
//	       System.out.println("Emplyoyee Address: "+empaddr);
//	  
//	  }
	  public void display3() {
		  System.out.println("Employee Details3");
	       System.out.println("================");
	       System.out.println("Emplyoyee Id: "+empid1);
	       System.out.println("Emplyoyee Name: "+empname1);
	       System.out.println("Emplyoyee Salrary: "+empsal1);
	       System.out.println("Emplyoyee Address: "+empaddr1);
	  
	  }

	public static void main(String[] args) {
	
	
	  Employee emp=	new Employee();
      emp.display();
      display1();	
      emp.display3();
      
      System.out.println();
      System.out.println("===========");
      Employee emp1=	new Employee();
      System.out.println(emp1); //Employee object hashcode com.test.Employee@43a25848
      
      Employee emp2=new Employee();
      emp2.empid2=1003;
      emp2.empname2="Riya";
      
      // emp2.pincode=7475;  //Type mismatch: cannot convert from int to Pincode
      
      emp2.pincode=new Pincode();     	
      emp2.pincode.state= "cg";
      emp2.pincode.pincode=495113;
      
      System.out.println("Employee Details3");
      System.out.println("================");
      System.out.println("Emplyoyee Id: "+emp2.empid2);
      System.out.println("Emplyoyee Name: "+emp2.empname2);
      System.out.println("Emplyoyee Salrary: "+emp2.empsal2);
      System.out.println("Emplyoyee Address: "+emp2.empaddr2);
      System.out.println("Emplyoyee State: "+emp2.pincode.state);
      System.out.println("Emplyoyee Pincode: "+emp2.pincode.pincode);
      
	}

}
