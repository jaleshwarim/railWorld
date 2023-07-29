package com.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		LocalDate dt=  LocalDate.now();
//		System.out.println(dt);
		
		
		
//		Employee emp []=new Employee[1]; 
		
//	   String str=dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//	    System.out.println(str);
	
	   Scanner sc =new Scanner(System.in);
	   
	   System.out.println("Enter Employee Id :");
	   int id = sc.nextInt();
	   System.out.println("Enter Employee Name :");
	   String name = sc.next();
	    System.out.println("Enter Date of  :");
	  
	       String date=sc.next();
	       LocalDate locald=  LocalDate.parse(date,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	       
	       
//	       DateTimeFormatter d2= DateTimeFormatter.ofPattern("yyyy-MM-dd");
	       
	       Date date1= Date.valueOf(locald);
	   	Employee emp =new Employee(id,name,date1);
	   	System.out.println(emp);
	       
	       
//	       for(Employee e:emp) {
//	    	   System.out.println(e);
//	       }
	       
	      
	   
	
	
	}
}
