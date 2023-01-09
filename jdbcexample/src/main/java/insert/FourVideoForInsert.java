package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FourVideoForInsert {

	private static String count;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
	     String url="jdbc:mysql://localhost:3306/company";
	     String username="root";
	     String password="root";
	     String query= "insert into employee2 values(105,'Anam','Sakinaka','Mumbai')"; 
	     
	     Connection con=DriverManager.getConnection(url,username,password);
	     Statement st = con.createStatement();
		System.out.println(count+"row/s affected");
	     int count = st.executeUpdate(query);
	     st.close();
	     con.close();
	}

}
