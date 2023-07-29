package com.test.treeset;

public class Person2 {

	   private  int pId;
	    private String pName;
	    private int pAge;
	    private String pGender;
	     private double pSal;
		public Person2() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Person2(int pId, String pName, int pAge, String pGender, double pSal) {
			super();
			this.pId = pId;
			this.pName = pName;
			this.pAge = pAge;
			this.pGender = pGender;
			this.pSal = pSal;
		}
		public int getpId() {
			return pId;
		}
		public void setpId(int pId) {
			this.pId = pId;
		}
		public String getpName() {
			return pName;
		}
		public void setpName(String pName) {
			this.pName = pName;
		}
		public int getpAge() {
			return pAge;
		}
		public void setpAge(int pAge) {
			this.pAge = pAge;
		}
		public String getpGender() {
			return pGender;
		}
		public void setpGender(String pGender) {
			this.pGender = pGender;
		}
		public double getpSal() {
			return pSal;
		}
		public void setpSal(double pSal) {
			this.pSal = pSal;
		}
		@Override
		public String toString() {
			return "Person2 [pId=" + pId + ", pName=" + pName + ", pAge=" + pAge + ", pGender=" + pGender + ", pSal="
					+ pSal + "]";
		}
	     
}
