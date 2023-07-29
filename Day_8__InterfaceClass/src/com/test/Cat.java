package com.test;

public class Cat implements Animal{

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("Cat have four lage");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("cat are walking");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("cat are sleeping");
		
	}
	
	public void noise() {
		System.out.println(" Cat noise meows");
	}

}
