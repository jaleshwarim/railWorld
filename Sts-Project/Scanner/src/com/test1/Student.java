package com.test1;

public class Student {

	public int stuRoll;
	public String stuName;
	public String Age;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int stuRoll, String stuName, String age) {
//		super();
		this();
		this.stuRoll = stuRoll;
		this.stuName = stuName;
		this.Age = age;
	}


	public int getStuRoll() {
		return stuRoll;
	}


	public void setStuRoll(int stuRoll) {
		this.stuRoll = stuRoll;
	}


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public String getAge() {
		return Age;
	}


	public void setAge(String age) {
		Age = age;
	}


	@Override
	public String toString() {
		return "Student [stuRoll=" + stuRoll + ", stuName=" + stuName + ", Age=" + Age + "]";
	}
	
	
	
	
}
