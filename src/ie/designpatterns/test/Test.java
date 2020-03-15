package ie.designpatterns.test;

import ie.designpatterns.client.ClientCommandLine;
import ie.designpatterns.connection.ConnectionDatabase;
import ie.designpatterns.country.Country;
import ie.designpatterns.country.CountryE;
import ie.designpatterns.country.CountryFactory;
import ie.designpatterns.country.CountryObjects;

public class Test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConnectionDatabase.getConnection();
		ClientCommandLine ccl = new ClientCommandLine();
		ccl.showOptions();
		Country brazil = CountryFactory.createCountry(ccl.getCountryN(),ccl.getSurface(), 
						ccl.getHead(), CountryE.getCountryE(ccl.getContinent()));
		System.out.println(brazil);
		
	}

}
