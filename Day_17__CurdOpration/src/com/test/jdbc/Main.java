package com.test.jdbc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		StudentJDBCDAO student= new StudentJDBCDAO();
		StudentBean bean=new StudentBean();
		
//		bean.setRollNo(102);
//		bean.setName("Jaleshwari");
//		bean.setCourse("MCA");
//		bean.setAdderess("BSP");
//	
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Student roll no :");
//		int roll=sc.nextInt();
//		System.out.println("Enter Student Name :");
//		String name =sc.next();
//		System.out.println("Enter Student Course :");
//		String course =sc.next();
//		System.out.println("Enter Student Address :");
//		String adder =sc.next();
//	
//		bean.setRollNo(roll);
//		bean.setName(name);
//		bean.setCourse(course);
//		bean.setAdderess(adder);
//        
////		add table data
//		student.add(bean);
//		
//		update table 
//		System.out.println("Update table");
//		System.out.println("Enter Student roll no :");
//		int roll1=sc.nextInt();
//		System.out.println("Enter Student Name :");
//		String name1 =sc.next();
//		
//		StudentBean updateStu=new StudentBean();
//		
//		updateStu.setRollNo(roll1);
//		updateStu.setName(name1);
//		
//		student.update(updateStu);
		
////		delete where the condition true
		System.out.println("Delete table row");
		System.out.println("Enter Student roll no :");
		int roll2=sc.nextInt();
		student.delete(roll2);
//		
//		Show table details
		student.findAll();
		
	}
}
