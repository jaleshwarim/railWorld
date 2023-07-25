package com.test.treeset;

import java.util.Comparator;

public class PersonComp implements Comparator<Person2>{

	@Override
	public int compare(Person2 o1, Person2 o2) {
		if(o1.getpSal() >o1.getpSal()) {
			return -1;
		
	     }
		else if(o1.getpSal() < o2.getpSal()) {
		   return 1;	
		}
		else 
			return 0;
		
	
	}

}