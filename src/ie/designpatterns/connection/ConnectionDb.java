package ie.designpatterns.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*REFERENCES: 
The code from CodersMilitia.ie available on https:
www.codersmilitia.com/javadesignpattern/proxy-design-pattern-in-java/ 
was used as a reference for the implementation of the Proxy Design Pattern. 
*/
//Class that creates the connection with the database 
public class ConnectionDb implements Database {
	
	private Connection conn;//VARIABLE TO HOLD THE CONNECTION 
	
	public ConnectionDb() {
		
		String url = "jdbc:mysql://52.50.23.197:3306/world";

		try {
			conn = DriverManager.getConnection(url, "cctstudent", "Pass1234!");//CONNECTION TO THE DATABASE

		} catch (SQLException e) {//TO HANDLE ERRORS
			e.printStackTrace();
			System.out.println("The connection failed");

		}
	}
	@Override
	public Connection getConnection() {//METHOD THE RETURN THE CONNECTION
		// TODO Auto-generated method stub
		return conn;
	}
	

}
