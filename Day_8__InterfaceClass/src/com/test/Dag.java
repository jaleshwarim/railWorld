package com.test;

public class Dag implements Animal{

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
		System.out.println("Dag have four lage");
		
	}

	
	public void noice() {
		System.out.println(" Cat noise bark");
	}
	
	public void sleep() {
		System.out.println("Dogs are sleeping");
	}


	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Dogs are walking");
		
	}
	
	
}
