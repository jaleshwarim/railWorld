package com.test;

public class Main {
	
	public static void main(String[] args) {
		
		Animal a= new Dag();// Loosly couple
		
		System.out.println();
		a.info();
		
		Dag d= new Dag();  //tightly couple
		d.noice();
		d.walk();
		d.sleep();
		
		Cat c= new Cat();
		c.noise();
		c.walk();
		c.sleep();
	}

}
