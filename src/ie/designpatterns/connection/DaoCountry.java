package ie.designpatterns.connection;

import java.sql.Connection;

import ie.designpatterns.country.Country;

public class DaoCountry {
	
	Connection conn;
	
	public DaoCountry(Connection conn) {
		this.conn = conn;
	}
	
	public Country addCountry(Country country) {
		
		return country;
		
		
		
	}

}
