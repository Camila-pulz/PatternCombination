package ie.designpatterns.connection;

import java.sql.Connection;

public class ProxyConnection implements Database {
	
	private ConnectionDb connection;
	
	public ProxyConnection() {
		
	}
	@Override
	public Connection getConnection() {
		if(connection == null) {
			connection = new ConnectionDb();
			
		}
		return connection.getConnection();
	}

}
