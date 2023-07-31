package com.test.jdbc;

import java.sql.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/Railworld";
		String user="root";
		String pwd="root";
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		try {
//			Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
//			get the Connection Object
			con=DriverManager.getConnection(url, user, pwd);
//			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Railworld","root","root");
			
//			System.out.println(con);
//			if(con !=null) {
//				System.out.println("Connection");
//			}
//			else
//			{
//				System.out.println("Not Connection");
//			}
			
//			Set data in database
			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter Employee Id :");
//			int eid =sc.nextInt();
////			sc.nextLin();
//			System.out.println("Enter Employee name :");
//			String ename= sc.next();
//			System.out.println("Enter Employee esal :");
//			double esal= sc.nextDouble();
			
//			Create the Statement object
			Statement stmt=con.createStatement();
//			int i = stmt.executeUpdate("insert into employee values(101,'jaleshwari',25255.98)");
//			System.out.println("Nomber of record inserted :"+i);

//			Excute the Query
//			int j = stmt.executeUpdate("insert into employee values("+eid+",'"+ename+"',"+esal+")");
			
//			System.out.println("Nomber of record inserted :"+j);
			
//			Retrive employee values form Sql Database
			
			ResultSet result= stmt.executeQuery("Select * from  Employee");
			
		   while(result.next()) {
				  int eid=result.getInt(1);
				  String ename=result.getString(2);
				  double esal=result.getDouble(3);
				
				System.out.println("Employee id :"+eid+" Employee Name :"+
			                     ename+" employee salry "+esal);
			}
			
//			Close the Connection object
			stmt.close();
			con.close();
		} 
		
		catch (ClassNotFoundException | SQLException obj) {
			obj.printStackTrace();
		}

	}

}
