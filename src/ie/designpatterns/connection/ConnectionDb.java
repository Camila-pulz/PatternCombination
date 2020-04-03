package ie.designpatterns.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionDb implements Database {
	
	private Connection conn;
	
	public ConnectionDb() {
		
		String url = "jdbc:mysql://52.50.23.197:3306/world";

		try {
			conn = DriverManager.getConnection(url, "cctstudent", "Pass1234!");

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("The connection failed");

		}
	}
	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return conn;
	}
	

}
