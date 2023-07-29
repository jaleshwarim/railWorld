package com.test;

public class Account {
   
	public  int accno;
	public String name;
	
	enum AccType{
		SAVINGACCOUNT,
		CURRENTACCOUNT;
	}
	
	enum Gender{
	 FEMALE,
	 MALE;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + "]";
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account(int accno, String name) {
		super();
		this.accno = accno;
		this.name = name;
	}


	
	
	
	
}
