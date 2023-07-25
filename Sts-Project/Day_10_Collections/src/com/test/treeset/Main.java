package com.test.treeset;

import java.util.TreeSet;

public class Main {
   
	public static void main(String[] args) {
		
		TreeSet<Person> tset= new TreeSet<>();
		TreeSet<Person2> tset2= new TreeSet<>(new PersonComp());
		
		tset.add(new Person(101, "Samita", 25,"FEMALE",50000.0));
		tset.add(new Person(102, "Rahul", 27,"MALE",60000.0));
		tset.add(new Person(101, "Rahul", 28,"MALE",5000.0));
		tset.add(new Person(102, "Kavita", 25,"FEMALE",50000.0));
//		System.out.println(tset);
		
		tset2.add(new Person2(101, "Samita", 25,"FEMALE",50000.0));
		tset2.add(new Person2(102, "Rahul", 27,"MALE",60000.0));
		tset2.add(new Person2(101, "Rahul", 28,"MALE",5000.0));
		tset2.add(new Person2(102, "Kavita", 25,"FEMALE",50000.0));
		
		  for(Person2 p:tset2) {
			  
			  System.out.println(p);
		  }
		
	
	}
}
