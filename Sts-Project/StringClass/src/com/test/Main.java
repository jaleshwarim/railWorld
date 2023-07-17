package com.test;
import com.test1.*;

public class Main {
	public static void main(String[] args) {
		
		String str="welcome";
		
		String str1 =new String("Hello");
		  str.concat("world");
		
		  StringBuilder sb=new StringBuilder("welcome");
		  sb.append("world");
		  
		  
		  System.out.println(str);
		  System.out.println(sb);
		  
		  StringClass sc=new StringClass(1,"Aman",23,"male",354665,"It");
		  StringClass sc1=new StringClass(1,"Aman",23,"male",354665,"It");
		  
		  System.out.println(sc.equals(sc1));
		  System.out.println(sc==sc1);
		  
		  
		  System.out.println("=====================");
		  StringMethods sm= new StringMethods();
		  
		  System.out.println(sm);
		  
		  String str4 = "railWorld com";
	       
	       String result = str4.toUpperCase();
	       System.out.println(result);
		  
		  
	}

	
}
