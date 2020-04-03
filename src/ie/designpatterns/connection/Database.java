package ie.designpatterns.connection;

import java.sql.Connection;

public interface Database {
	
	public Connection getConnection(); 
		
}
