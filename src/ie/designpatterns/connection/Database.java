package ie.designpatterns.connection;

import java.sql.Connection;

/*REFERENCES: 
The code from CodersMilitia.ie available on https:
www.codersmilitia.com/javadesignpattern/proxy-design-pattern-in-java/ 
was used as a reference for the implementation of the Proxy Design Pattern. 
*/

public interface Database {
	
	public Connection getConnection(); 
		
}
