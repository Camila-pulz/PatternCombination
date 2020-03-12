package ie.designpatterns.test;

import ie.designpatterns.connection.ConnectionDatabase;
import ie.designpatterns.country.Country;
import ie.designpatterns.country.CountryE;
import ie.designpatterns.country.CountryFactory;

public class Test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConnectionDatabase.getConnection();
		
		Country brazil = CountryFactory.createCountry("Brazil", 100, 'B', CountryE.SOUTH_AMERICA);
		System.out.println(brazil);
		
	}

}
