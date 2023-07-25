package com.test;

import com.test.Account.AccType;
import com.test.Account.Gender;

public class Main {

	
	
	public static void main(String[] args) {
		
		Account a1= new Account();
		
		a1.setAccno(54322);
		a1.setName("ramesh");
		
		System.out.println(a1.getAccno());
		System.out.println(a1.getName());
		Gender a2= Gender.FEMALE;
		System.out.println(a2);
		
		AccType a3= AccType.SAVINGACCOUNT;
		System.out.println(a1.getAccno()+" "+a1.getName()+" "+" "+a2+a3);
		
	}
}
