package ie.designpatterns.connection;

import java.sql.Connection;

/*REFERENCES: 
The code from CodersMilitia.ie available on https:
www.codersmilitia.com/javadesignpattern/proxy-design-pattern-in-java/ 
was used as a reference for the implementation of the Proxy Design Pattern. 
*/

public class ProxyConnection implements Database {
	
	private ConnectionDb connection;
	
	//Constructor
	public ProxyConnection() {
		
	}
	@Override
	public Connection getConnection() {//method implemented from the Interface Database 
		if(connection == null) {//IF THERE IS NO CONNECTION YET
			connection = new ConnectionDb();//CREATE AN OBJECT OF THE CLASS WHICH PERFORMS THE CONNECTION
			
		}
		return connection.getConnection();//CALL THE CONNECTION
	}

}
