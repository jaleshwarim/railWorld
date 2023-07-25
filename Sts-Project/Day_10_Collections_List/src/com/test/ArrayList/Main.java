package com.test.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
   
	public static void main(String[] args) {
		
		ArrayList<Student> stu=new ArrayList<>();
		
		HashSet<Student> hset=new HashSet<>();
		
//		ArrayList
		stu.add(new Student(101, "Samita", 500));
		stu.add(new Student(102, null, 507));
		stu.add(new Student(101, "Samita", 500));
		
		for(Student s:stu) {
//			System.out.println(s.getRoll() +" "+s.getName()+" "+s.getMark());
		}
		
		
//		Hashset
		hset.add(new Student(101, "Samita", 506));
		hset.add(new Student(101, "Samita", 506));
		
		hset.add(new Student(102, null, 507));
		hset.add(new Student(102, null, 507));
		hset.add(new Student(101, "rahul", 509));
		
		
		for(Student s:hset) {
			System.out.println(s.getRoll() +" "+s.getName()+" "+s.getMark());
		}

	}
}
