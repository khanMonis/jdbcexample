package com.monis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.Statement;

public class InsertRecords {
	public static void main(String[] args) {
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mystudent","root","root");
	String sql="insert into monisjdbc(name,age) values(?,?)";
	PreparedStatement pt=connection.prepareStatement(sql);
	
	pt.setString(1, "Shadab");
	pt.setInt(2, 24);
	
	int i = pt.executeUpdate();
	System.out.println(i);
	pt.close();
connection.close();	
}

catch(Exception e){
	System.out.println(e);
}
	}


}
