package ie.designpatterns.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
	
	public static Connection conn = null;
	
	public static Connection getConnection() {
		
		String url = "jdbc:mysql://52.50.23.197:3306/world";
		
		try {
			
			conn = DriverManager.getConnection(url, "cctstudent", "Pass1234!");
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		return conn;
		
	}
	

}
