package com.springjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Student {
	private  String driver="com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/Buniyad";
	private String username="root";
	private String pass="root";
	
	  public void fetchData() throws SQLException, ClassNotFoundException {
		 Class.forName(driver);
		  Connection con=DriverManager.getConnection(url,username, pass);
		  Statement stm=con.createStatement();
		  ResultSet rs=stm.executeQuery("select * from Student");
		  while(rs.next()) {
			  int id=rs.getInt(1);
			  String name=rs.getString(2);
			  String address=rs.getString(3);
			  System.out.println(id+" "+name+" "+address);
		  }
		
			  
		  
	  }
}
