package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		PersionImple pi=new PersionImple();
		pi.hieght();
		pi.eat();
		pi.walk();
		pi.sleep();
		
		
   // 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student id");
		int sid= sc.nextInt();
		
		System.out.println("Enter Student Name:");
		String sname= sc.next();
		
		System.out.println("Enter Student  Age:");
		int sAge= sc.nextInt();
		
		System.out.println("Enter Student Gender as FEMALE or MALE");
		int sgender= sc.nextInt();
		
		Student s1 =new Student();
		s1.setSid(sid);
		s1.setSname(sname);
		s1.setsAge(sAge);
		s1.setGENDER(enum, ());
		
		System.out.println(s1);
	}

}
