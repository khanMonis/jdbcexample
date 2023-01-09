package com.insert.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee{
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
			Statement stm = con.createStatement();
			ResultSet query = stm.executeQuery("select * from student");
			while (query.next()) {
				System.out.println(query.getInt(1)+"  "+query.getString(2)+"  "+query.getString(3)+"  "+query.getString(4));

			}
			}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
