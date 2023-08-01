package com.railworld.dao;

import java.sql.SQLException;
import java.util.List;

import com.railworld.exception.EmployeeException;
import com.railworld.model.StudentBean;

public interface StudentDAO {
	
	public String addStudent(StudentBean student) throws SQLException;
	public  List<StudentBean> findAll() throws SQLException ,EmployeeException;
	public void delete(int d) throws SQLException;
	
	public void updateStudent(StudentBean studentBean) throws SQLException;

}
