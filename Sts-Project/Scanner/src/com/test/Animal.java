package com.test;

public class Animal {
   
    public	String aniName;
	public String aniColor;
	public int aniAge;
	public int aniNofLeg;
	public int aniWei;
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Animal [aniName=" + aniName + ", aniColor=" + aniColor + ", aniAge=" + aniAge + ", aniNofLeg="
				+ aniNofLeg + ", aniWei=" + aniWei + "]";
	}
	public String getAniName() {
		return aniName;
	}
	public void setAniName(String aniName) {
		this.aniName = aniName;
	}
	public String getAniColor() {
		return aniColor;
	}
	public void setAniColor(String aniColor) {
		this.aniColor = aniColor;
	}
	public int getAniAge() {
		return aniAge;
	}
	public void setAniAge(int aniAge) {
		this.aniAge = aniAge;
	}
	public int getAniNofLeg() {
		return aniNofLeg;
	}
	public void setAniNofLeg(int aniNofLeg) {
		this.aniNofLeg = aniNofLeg;
	}
	public int getAniWei() {
		return aniWei;
	}
	public void setAniWei(int aniWei) {
		this.aniWei = aniWei;
	}
	
	
}
