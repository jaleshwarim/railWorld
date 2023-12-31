package com.railworld.model;

public class StudentBean {
	
	int rollNo;
	String name;
	String course;
	String adderess;
	
	public StudentBean() {
	}
	public StudentBean(int rollNo, String name, String course, String adderess) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.adderess = adderess;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAdderess() {
		return adderess;
	}
	public void setAdderess(String adderess) {
		this.adderess = adderess;
	}
	@Override
	public String toString() {
		return "StudentBean [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", adderess=" + adderess
				+ "]";
	}

	
}
