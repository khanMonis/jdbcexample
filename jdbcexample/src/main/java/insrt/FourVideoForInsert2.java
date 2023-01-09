package insrt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class FourVideoForInsert2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
	     String url="jdbc:mysql://localhost:3306/company";
	     String username="root";
	     String password="root";
	     int emp_id=108;
	     String name="Mazin";
	     String addr= "Rampur";
	     String city="Basti";
	     String query= "insert into employee2(emp_id,name,addr,city) values(?,?,?,?)"; 
	     
	     Connection con=DriverManager.getConnection(url,username,password);
	    PreparedStatement ps=con.prepareStatement(query);
	    ps.setInt(1, emp_id);
	    ps.setString(2, name);
	    ps.setString(3, addr);
	    ps.setString(4, city);
	     int count = ps.executeUpdate();
	     System.out.println(count + " row/s affected");
	     ps.close();
	     con.close();
	}

}
