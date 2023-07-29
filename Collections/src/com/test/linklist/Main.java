package com.test.linklist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

	
	public static void main(String[] args ) {
		List<Student>students =new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<1; i++) {
			System.out.println("Enter Student Roll Number :");
			int roll = sc.nextInt();
			System.out.println("Enter Student Name :");
			String name =sc.next();
			System.out.println("Enter Student Mark :");
			int mark= sc.nextInt();
			
		   
		  students.add( new Student(roll,name,mark));
			
//			st.getRoll(roll);
//			st.setName(name);
//			st.setRoll(roll);
			


		}
		
		
//		students.add(new Student(101,"Radha", 850));
//		students.add(new Student(102,"Syam", 860));
//		students.add(new Student(103,"Mohan", 870));
//		students.add(new Student(104,"Mira", 850));
//		students.add(new Student(105,"Kiran", 880));
		

		
//		Collections.sort(students,new StudentMarkComp());
		
		   
		
		for(Student student :students ) {
		
			System.out.println(student);
//		   System.out.println("Roll : "+student.getRoll());
//		   System.out.println("Name : "+student.getName());
//		   System.out.println("mark : "+student.getMark());
		   
//		   System.out.println("Roll : "+student.getRoll()+" "+
//		   "Name : "+student.getName()+" "+"mark : "+student.getMark());
		}
	}
}
