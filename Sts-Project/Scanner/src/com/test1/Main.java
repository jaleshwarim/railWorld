package com.test1;
import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Student Roll Number");
		int stuRoll= sc.nextInt();
		System.out.println("Enter Student Name :");
		String stuName =sc.next();
		System.out.println("Enter Student Age");
		String Age =sc.next();
		
		Student st =new Student();
		st.setStuRoll(stuRoll);
		st.setStuName(stuName);
		st.setAge(Age);
		System.out.println(st);
		
	}
}
