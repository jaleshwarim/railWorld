package com.railworld.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


import com.railworld.model.StudentBean;
import com.railworld.dao.*;
import com.railworld.exception.EmployeeException;

public class Main {

	public static void main(String[] args) {

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
//		StudentDAO student=new StudentDAO();
//		StudentBean stuBean=new StudentBean();
//		stuBean.setRollNo(roll);
//		stuBean.setName(name);
//		stuBean.setCourse(course);
//		stuBean.setAdderess(adder);
		
		
//          Loose coupling		
	        StudentDAO student= new StudentDAOImplement();
//	        try {
//				student.addStudent(stuBean);
//			} catch (SQLException e) {
//				
//				e.printStackTrace();
//			}
	        

	        // get the list of employee
	        
	       
//	         try {
//			      List<StudentBean>  students =	student.findAll();
//			      
//			      students.forEach(System.out::println);
//			} catch (SQLException | EmployeeException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	         
	        
//	        delete one row
//	         System.out.println("Enter Student Id for Delete:");
//	         int sid1= sc.nextInt();
//	         
//	         try {
//				student.delete(sid1);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	        
	        
//	        Update one row
	        System.out.println("Enter a update Name: ");
	        String name1= sc.next();
	         System.out.println("Enter Student Id for update:");
	         int sid2= sc.nextInt();
	         
	         StudentBean studentBean1=new StudentBean();
	         studentBean1.setName(name1);
	         studentBean1.setRollNo(sid2);
	         
	         try {
				student.updateStudent(studentBean1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
