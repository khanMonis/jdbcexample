package featch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FirstvideoForFeatch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     Class.forName("com.mysql.cj.jdbc.Driver");
     String url="jdbc:mysql://localhost:3306/company";
     String username="root";
     String password="root";
     String query= "select address from student where id=8"; 
     Connection con=DriverManager.getConnection(url,username,password);
     Statement st = con.createStatement();
     ResultSet rs=st.executeQuery(query);
     rs.next();
     String name =rs.getString("address");
     System.out.println(name);
     ((ResultSet) st).close();
     con.close();
     
	}

}
