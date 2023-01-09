package com.featch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Student {
	
	public static void main(String[] args)throws Exception{
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			String query="insert into student(id,name,address,city)values(?,?,?,?)";
			PreparedStatement pt=connection.prepareStatement(query);
			pt.setInt(1, 23);
			pt.setString(2, "Faiz");
			pt.setString(3,"Mumbai");
			pt.setString(4,"Maharashtra");
			int i=pt.executeUpdate();
			System.out.println(i);
		
		
	}

}
