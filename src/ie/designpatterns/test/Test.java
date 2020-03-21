package ie.designpatterns.test;

import java.util.List;

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
		ClientCommandLine ccl = new ClientCommandLine();
		ccl.showOptions();
		
		/*************************TestADD_NEW_COUNTRIES*********************************/
		//Country brazil = CountryFactory.createCountry(ccl.getCode(),
		//ccl.getCountryN(), CountryE.getCountryE(ccl.getContinent()),
		//ccl.getSurface(), ccl.getHead());
		//System.out.println(brazil);
		DaoCountry dao = new DaoCountry(ConnectionDatabase.getConnection());
		//dao.addCountry(brazil);
		//System.out.println("Done");
		
		/*************************TestSELECT_ALL_CONTRIES******************************/
		
		List<Country> countries = dao.listAllCountries();
			for (Country c : countries) {
		System.out.println(countries);
			//}
		
		/*************************TestSELECT_COUNTRIES_BY_CODE*************************/

		//List<Country> countries2 = dao.findCountryByCode(ccl.getCode2());
		//for(Country c: countries2) {
			//System.out.println(c);

		}
	}

}
