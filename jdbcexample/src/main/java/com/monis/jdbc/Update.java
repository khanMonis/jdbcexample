package com.monis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mystudent", "root", "root");
		Statement stm = con.createStatement();
		
		 String query= "select age from monisjdbc where id=2"; 

	     ResultSet rs=stm.executeQuery(query);
	     rs.next();
	     String age =rs.getString("age");
	     System.out.println(age);
	     ((ResultSet) stm).close();
	     con.close();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
 }

}
