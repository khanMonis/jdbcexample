package feach3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ThirdvideoForFeatch {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
	  
	     String query= "select * from student"; 
	     
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
	     Statement st = con.createStatement();
	     ResultSet rs=st.executeQuery(query);
	     String userData=" ";
	     rs.next();
	     userData =rs.getInt(1)+":"+rs.getString(2);
	     System.out.println(userData);
	     rs.next();
	     userData =rs.getInt(1)+":"+rs.getString(2);
	     System.out.println(userData);
	     st.close();
	     con.close();
	}

}
