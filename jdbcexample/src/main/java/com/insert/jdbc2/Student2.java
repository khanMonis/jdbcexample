package com.insert.jdbc2;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Student2 {

	public static void main(String[] args) {
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
	String sql="insert into student2(name,address,city) values(?,?,?)";
	PreparedStatement pt=connection.prepareStatement(sql);
	
	pt.setString(1, "Arham");
	pt.setString(2, "Maali Tola");
	pt.setString(3, "Basti");
	int i = pt.executeUpdate();
	System.out.println(i);
	}
catch(Exception e){
	System.out.println(e);
}
	}

}
