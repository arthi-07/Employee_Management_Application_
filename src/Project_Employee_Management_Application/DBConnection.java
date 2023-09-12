package Project_Employee_Management_Application;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection
{
	static Connection con;
	public static Connection createDBConnection()
	{
		
		
		try
		{
			//load the driver class
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//get connection
			
			String url = "jdbc:mysql://localhost:3306/PROJECT?useSSL=false";
			//String url = "jdbc:mysql://localhost:3306/PROJECT?characterEncoding=utf8";
			String username = "root";
			String password = "r3papa37";
			con = DriverManager.getConnection(url,username,password);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return con;
	}
}
