package com.test.multipleinheritance;

public class Demo implements Printable, Showable {

	@Override
	public void show() {
		
		System.out.println("Hello");
		
	}

	@Override
	public void print() {
		System.out.println("Welcome");
		
	}
	
	public static void main(String[] args) {
		
		Demo obj = new Demo();
		obj.print();
		obj.show();
		Printable p = new Demo();
		p.print();
//		Showable s = new Showable();
//		s.show();
	}

}
