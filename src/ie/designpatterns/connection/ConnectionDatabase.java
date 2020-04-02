package ie.designpatterns.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
	
	//public static Connection conn = null;
	
	private static Connection conn = null;
	
	//Private Constructor
	private ConnectionDatabase() {
		
	}
	public static Connection getConnectionDatabase() {

		String url = "jdbc:mysql://52.50.23.197:3306/world";

		try {

			conn = DriverManager.getConnection(url, "cctstudent", "Pass1234!");

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("The connection failed");

		}
		return conn;

	}

}