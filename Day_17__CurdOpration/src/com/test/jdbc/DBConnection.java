package com.test.jdbc;
import java.sql.*;

public class DBConnection {


		
		
		 String url="jdbc:mysql://localhost:3306/Railworld";
			String name="root";
			String pwd= "root";
			
			private static DBConnection dbConnection=null;

			private DBConnection(){

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");			
				     } 
				    catch ( ClassNotFoundException e) {
				         e.printStackTrace();
				   }
				}
			
			public Connection getConnection() throws SQLException{
			
				Connection con=null;
				con= DriverManager.getConnection(url, name,pwd);
			       
			       if(con!=null) {
			    	   System.out.println("Connection");
			       }
			       else
			       {
			    	   System.out.println("Not connection");
			       }
			       
			       return con;
			}
			


			 public static DBConnection getInstance() {
			    if(dbConnection==null) {
			    	dbConnection= new DBConnection();
			    }
				 
				 return dbConnection;
				 
			 }
			


	


}
