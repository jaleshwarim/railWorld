package com.railworld.utility;
import java.sql.*;

public class DBConnection {
	


	public static Connection getConnection() {

	
	   String url="jdbc:mysql://localhost:3306/Railworld";
	   String user="root";
	   String pwd="root";	
	    Connection con =null;
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
		    con= DriverManager.getConnection(url,user,pwd);
		      
//            return con;
	    	
	    }catch(SQLException |ClassNotFoundException ob) {
	    	ob.printStackTrace();
	    }
		return con;
	   
	 
	      
	    }
	
	
	}
