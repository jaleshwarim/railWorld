package com.railworld.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.railworld.exception.EmployeeException;
import com.railworld.exception.*;
import com.railworld.model.StudentBean;
import com.railworld.utility.DBConnection;

public class StudentDAOImplement implements StudentDAO{
	
	
	private Connection connection;
	 PreparedStatement prepareStmt=null;
	

	public StudentDAOImplement() {
	     this.connection=DBConnection.getConnection();
	     
	
	}



	@Override
	public String addStudent(StudentBean studentBean) throws SQLException {
		
		prepareStmt=connection.prepareStatement("insert into student values(?,?,?,?)");
		prepareStmt.setInt(1,studentBean.getRollNo());
		prepareStmt.setString(2, studentBean.getName());
		prepareStmt.setString(3, studentBean.getCourse());
		prepareStmt.setString(4, studentBean.getAdderess());
		
		
		 int x= prepareStmt.executeUpdate();
		 if(x>0) {
			return "Sucessfully Update...";
		 }{
		 return "Unsucessfully Update...";
		 }
		
	}

	



		@Override
		public List<StudentBean> findAll() throws SQLException, EmployeeException {
			  List<StudentBean> students = new ArrayList<>();
        	  prepareStmt= connection.prepareStatement("select * from Student");
        	  ResultSet result=prepareStmt.executeQuery();
        	  
        	  while(result.next()) {
        		  StudentBean stu= new StudentBean(result.getInt("rollNo"),result.getString("name"),result.getString("course"),result.getString("address"));
        	    students.add(stu);
        	  }
        	  
        	  if(students.size() != 0) {
  	    	    return students;     
  	            }
        	  else 
  	            {
  	    	 throw new EmployeeException("there is no entry in the database");
  	                }
        	  
			
		}



		@Override
		public void delete(int d) throws SQLException {
			
			 prepareStmt= connection.prepareStatement("delete from Student where rollNo=? ");
			 
			  prepareStmt.setInt(1, d);
		     	
			  int x=  prepareStmt.executeUpdate();
			  System.out.println("Data Sucessfully Deleted....");
      		if(x>0) {
    			System.out.println("Data Sucessfully Deleted....");
    		 }{
    		     System.out.println("Data Unsucessfully Deleted....");
    		 }
		}



		@Override
		public void updateStudent(StudentBean studentBean) throws SQLException {
			
			prepareStmt=connection.prepareStatement("update student set name=? where rollNo=?");
			
			prepareStmt.setString(1, studentBean.getName());
			prepareStmt.setInt(2,studentBean.getRollNo());
			 prepareStmt.executeUpdate();
			 System.out.println("Succefully updated.......");
			
			
			
		}	
}
