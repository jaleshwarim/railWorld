package com.test.jdbc;
import java.sql.*;
public class StudentJDBCDAO {
	
	Connection connection=null;
	PreparedStatement prepareStmt=null;
    ResultSet resultSet=null;
    Statement stmt=null;
	
    public StudentJDBCDAO() {
	
	}
    
    private Connection getConnection() throws SQLException {
    	Connection con;
    	con=DBConnection.getInstance().getConnection();
    	return con;
    }
    
//    Add data
    public void add(StudentBean studentBean) {
    	try {
    		
    		connection= getConnection();
    		prepareStmt=connection.prepareStatement("insert into student values(?,?,?,?)");
    		prepareStmt.setInt(1,studentBean.getRollNo());
    		prepareStmt.setString(2, studentBean.getName());
    		prepareStmt.setString(3, studentBean.getCourse());
    		prepareStmt.setString(4, studentBean.getAdderess());
    		
    		prepareStmt.executeUpdate();
    		System.out.println("Sucessfully Added....");
   				
    	}
    	catch(SQLException e) {
    		 e.printStackTrace();
    	}
    }
    
//   Update data
   
    public void update(StudentBean studentBean) {
    	
    	try {
    		connection =getConnection();
    		prepareStmt=connection.prepareStatement("update student set name=? where rollNo=?");
    		prepareStmt.setInt(1,studentBean.getRollNo());
    		prepareStmt.setString(2, studentBean.getName());
    		
    		prepareStmt.executeUpdate();
    		System.out.println("Sucessfully Update....");
    	}
    	catch(SQLException ob) {
    		ob.printStackTrace();
    	}
    }
    
    public void delete(int rollNo) {
    	  try {
    		  connection=getConnection();
    	      prepareStmt=connection.prepareStatement("delete from student where rollNo=?");
    	      prepareStmt.setInt(1,rollNo);
      		      		
      		  prepareStmt.executeUpdate();
      		  System.out.println("Data Sucessfully Deleted....");
    	  }	  
    	  
    	  catch(SQLException ob) {
    		  ob.printStackTrace();
    	  }
    	
    }

    public void findAll() {
        
    	try {	
    		connection=getConnection();
             prepareStmt=connection.prepareStatement("Select * from student");
             resultSet=prepareStmt.executeQuery();
             System.out.println("Show Table Details");
             
              while(resultSet.next()) {
            	  System.out.println(resultSet.getInt("rollNo")+" "+resultSet.getString("name")+" "+
            			  resultSet.getString("course")+" "+resultSet.getString("address"));
            	  
            }
    		
    	}
    	catch(SQLException ob) {
    		ob.printStackTrace();
    	}
    
    }
    
}
