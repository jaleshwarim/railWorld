package com.test;

public class Main {

	
//	public Main(int i, String string, String string2) {
//		
//	}

	public static void main(String[] args) {
		Employee e1=new Employee(1,"Ram","Male");
		Employee e2=new Employee(1,"Ram","Male");
		e1.info();
		e2.info();
		System.out.println(e1.info());
		System.out.println(e2.info());
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
		
		
		
	}
}
