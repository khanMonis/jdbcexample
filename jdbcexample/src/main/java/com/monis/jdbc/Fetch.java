package com.monis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fetch {


	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mystudent", "root", "root");
			Statement stm = con.createStatement();
			ResultSet query = stm.executeQuery("select * from monisjdbc");
			while (query.next()) {
				System.out.println(query.getInt(1)+"  "+query.getString(2)+"  "+query.getInt(3));

			}
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		}
}
