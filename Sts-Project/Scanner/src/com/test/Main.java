package com.test;
import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Animal Name :");
		String aniName=sc.next();
		
		System.out.println("Enter Animal Color :");
		String aniColor= sc.next();
		System.out.println("Enter Animal Age :");
		int aniAge= sc.nextInt();
		System.out.println("Enter Animal No of leg :");
		int aniLeg=sc.nextInt();
		System.out.println("Enter Animal Wieght :");
		int aniWie=sc.nextInt();
		
		
		Animal a=new Animal();
		
		a.setAniName(aniName);
		a.setAniAge(aniAge);
		a.setAniColor(aniColor);	
		a.setAniNofLeg(aniLeg);
		a.setAniWei(aniWie);
		
		
		System.out.println(a);
	}
}
