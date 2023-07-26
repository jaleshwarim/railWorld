package com.test.assig;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Person> person=new ArrayList<>();
		
		for(int i=0; i<4; i++) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Person id ");
			int pId= sc.nextInt();
			System.out.println("Enter Person First Name :");
			String fName=sc.next();
			System.out.println("Enter Person Last Name :");
			String lName=sc.next();
			System.out.println("Enter Person Age ");
			int age= sc.nextInt();
			System.out.println("Enter Person Gender FEMALE OR MALE :");
			String gender=sc.next();
			System.out.println("Enter Person Phone Number ");
			Long phonNo= sc.nextLong();
			
			 person.add(new Person(pId, fName, lName, age, gender,phonNo));
		}
		
		for(Person p:person) {
			System.out.println(p);
		}
	}

}
