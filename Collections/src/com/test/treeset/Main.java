package com.test.treeset;

import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		
		TreeSet<Person> tset=new TreeSet<>();
		
		tset.add(new Person(1,"Meena",28));
		tset.add(new Person(2,"Mukesh",26));
		tset.add(new Person(1,"Sara",27));
		
		for( Person p:tset) {
			System.out.println(p);
		}
	}
}
