package ie.designpatterns.test;

import ie.designpatterns.client.ClientCommandLine;
import ie.designpatterns.connection.ConnectionDatabase;
import ie.designpatterns.connection.DaoCountry;
import ie.designpatterns.country.Country;
import ie.designpatterns.country.CountryE;
import ie.designpatterns.country.CountryFactory;
import ie.designpatterns.country.CountryObjects;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ConnectionDatabase.getConnection();
		ClientCommandLine ccl = new ClientCommandLine();
		ccl.showOptions();
		Country brazil = CountryFactory.createCountry(ccl.getCode(), ccl.getCountryN(), CountryE.getCountryE(ccl.getContinent()), ccl.getSurface(), ccl.getHead());
		System.out.println(brazil);
		DaoCountry dao = new DaoCountry(ConnectionDatabase.getConnection());
		dao.addCountry(brazil);

	}

}
