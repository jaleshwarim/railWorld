package com.test.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Collections_Map {
	
	public static void main(String[] args) {
		
		 HashMap<Employee, EmployeeDetails> hashMap =new HashMap<>();
		 LinkedHashMap<Employee,EmployeeDetails>  linkedhashmap=new LinkedHashMap<>();
		 TreeMap<Employee, EmployeeDetails> treemap =new TreeMap<>();
//		 for(int i=0; i<1; i++) {
//			 Scanner sc=new Scanner(System.in);
//			 
//			 System.out.println("Enter ");
//		 }
		 hashMap.put(new Employee(101,"Mohan","Kumar"),new EmployeeDetails(101,6000.09,56853858,"hyd"));
		 hashMap.put(new Employee(102,"payre","Kumar"),new EmployeeDetails(102,44000.09,56853858,"hyd"));
		 hashMap.put(new Employee(103,"kriti","Kumar"),new EmployeeDetails(103,6000.09,56853858,"hyd"));
		 hashMap.put(new Employee(101,"Mohan","Kumar"),new EmployeeDetails(101,60000.09,56853858,"hyd"));
	   
		 Set<Employee> set= hashMap.keySet();
		 
//		 for(Employee emp:set) {
//			 System.out.println(emp);
//		 }
//		 
//		 Set<Entry<Employee, EmployeeDetails>> sentry= hashMap.entrySet();
//		 
//		 for(Entry<Employee,EmployeeDetails> entry:sentry) {
//			 
//			 System.out.println(entry.getKey()+" "+entry.getValue());
//		 }
//		
//		 
		 System.out.println("=========LinkedHashMap=======");
		 linkedhashmap.put(new Employee(101,"Mohan","Kumar"),new EmployeeDetails(101,6000.09,56853858,"hyd"));
		 linkedhashmap.put(new Employee(102,"payre","Kumar"),new EmployeeDetails(102,44000.09,56853858,"hyd"));
		 linkedhashmap.put(new Employee(103,"kriti","Kumar"),new EmployeeDetails(103,6000.09,56853858,"hyd"));
		 linkedhashmap.put(new Employee(101,"Mohan","Kumar"),new EmployeeDetails(101,60000.09,56853858,"hyd"));
		 linkedhashmap.put(null,new EmployeeDetails(101,60000.09,56853858,"hyd"));
		 linkedhashmap.put(null,new EmployeeDetails(101,60000.09,56853858,"bsp"));
		  
		
		 Set<Employee> keyset =linkedhashmap.keySet();
		 
//		 for()
		 
		 Set<Entry<Employee,EmployeeDetails>> setentry1= linkedhashmap.entrySet();
		 
		 for(Entry<Employee, EmployeeDetails> entry:setentry1) {
			 
			 System.out.println(entry.getKey()+" "+entry.getValue());
		 }
		 
		 
		 System.out.println("====== TreeMap ========");
		  treemap.put(new Employee(101,"Mohan","Kumar"),new EmployeeDetails(101,6000.09,56853858,"hyd"));
		  treemap.put(new Employee(102,"payre","Kumar"),new EmployeeDetails(102,44000.09,56853858,"hyd"));
		  treemap.put(new Employee(103,"kriti","Kumar"),new EmployeeDetails(103,70000.09,56853858,"hyd"));
		  treemap.put(new Employee(105,"Mohan","Kumar"),new EmployeeDetails(101,60000.09,56853858,"hyd"));
//		  treemap.put(null,new EmployeeDetails(101,60000.09,56853858,"hyd"));
//		  treemap.put(null,new EmployeeDetails(101,60000.09,56853858,"bsp"));
		  
		
		 Set<Employee> keyset1 =treemap.keySet();
		 
//		 for()
		 
		 Set<Entry<Employee,EmployeeDetails>> setentry2 = treemap.entrySet();
		 
		 for(Entry<Employee, EmployeeDetails> entry1:setentry2) {
			 
			 System.out.println(entry1.getKey()+" "+entry1.getValue());
		 }
		 
	
	}

}
