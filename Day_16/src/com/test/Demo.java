package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Demo {

	
	public static void main(String[] args) {
		 	
		MyInterface methodref=MethodRefrence::fun1;
		
//		System.out.println(methodref);
		methodref.fun("Ram");
		
		System.out.println();
		System.out.println("====Using Pradict Functional Iterface");
		List<Employee> empList=new ArrayList<>();
		
		empList.add(new Employee(101,"Ram",50000,858586556));
		empList.add(new Employee(102,"Sita",67866,858586556));
		empList.add(new Employee(103,"Lakhan",40000,858586556));
		empList.add(new Employee(104,"Kiran",6789697,858586556));
		

	   
		for(Employee emp: empList) {
//			System.out.println(emp);
		}

		
		empList.removeIf(employee ->employee.getEmpSal()< 60000);
		
		System.out.println(empList);
		
		System.out.println("====Using Consumer Functional Iterface");
		
		Consumer<Employee> cons= emp->{
			System.out.println("emp Id" +emp.getEmpId());
			System.out.println("Emp Name :"+emp.getEmpName());
			System.out.println("Emp Sal :"+emp.getEmpSal() );
			System.out.println("Emp Phone :"+emp.getEmpPhone());
			  };
			  
			  cons.accept(new Employee(106,"jaleshwari",78698,547878786));
			  
			  System.out.println("====Using Consumer  forEach method");
			  
			  empList.forEach(emp ->System.out.println(emp));
			  
			  System.out.println("====Using Method Refrence ====");
			  
			  empList.forEach(System.out::println);
				
			  
			  System.out.println("====Using Supplier Functional Iterface");
			  
			  Supplier<Employee> supList =()-> new Employee(107,"Khusi",87658,7484754);
			  Supplier<Employee> supList1 =()-> new Employee(107,"Khusi",87658,7484754);
				 
			  System.out.println(supList.get());
			  System.out.println(supList.get().getEmpName());
			  System.out.println(supList.equals(supList1));
			
			  System.out.println("====Using Function Functional Iterface");
			  
			  Function<Employee, String> funResult= list-> "New Joining "+list.getEmpName().toUpperCase();
			  
			  String empName =funResult.apply(new Employee(108,"Deva",50000,685855));
			  
			  System.out.println(empName);
		
			  List<Employee> empList1=new ArrayList<>();
				
			     empList1.add(new Employee(191,"hira takur",50000,858586556));
				empList1.add(new Employee(110,"prem",67866,858586556));
				empList1.add(new Employee(113,"mohni",40000,858586556));
				empList1.add(new Employee(114,"lakhaniya",6789697,858586556));
				
//				System.out.println("====Using Function Apply to forEach");
				
			
		
	}
}
