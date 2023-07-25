package com.test;

public class Student {
	
	private int sid;
	private  String sname;
	private int sAge;
	private  Gender GENDER;
	
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, int sAge, Gender gENDER) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sAge = sAge;
		GENDER = gENDER;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sAge=" + sAge + ", GENDER=" + GENDER + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public Gender getGENDER() {
		return GENDER;
	}
	public void setGENDER(Gender gENDER) {
		GENDER = gENDER;
	}
	
     
}
