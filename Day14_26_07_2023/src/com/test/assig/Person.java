package com.test.assig;

public class Person {
	
	private int id;
	private String fName;
	private String lName;
	private int age;
	private String gender;
	private long phoneno;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String fName, String lName, int age, String gender, long phoneno) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.gender = gender;
		this.phoneno = phoneno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", fName=" + fName + ", lName=" + lName + ", age=" + age + ", gender=" + gender
				+ ", phoneno=" + phoneno + "]";
	}
	
	

}
