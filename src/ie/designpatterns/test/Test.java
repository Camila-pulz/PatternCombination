package ie.designpatterns.test;

import java.io.IOException;
import java.util.List;

import ie.designpatterns.client.ClientCommandLine;
import ie.designpatterns.connection.ConnectionDatabase;
import ie.designpatterns.connection.DaoCountry;
import ie.designpatterns.country.Country;
import ie.designpatterns.country.CountryE;
import ie.designpatterns.country.CountryFactory;

public class Test {

	ClientCommandLine ccl = new ClientCommandLine(this);
	DaoCountry dao = new DaoCountry(ConnectionDatabase.getConnectionDatabase());

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new Test();

	}

	public Test() {
		ccl.showOptions();

	}

	public void addCountries() {

		Country brazil = CountryFactory.createCountry(ccl.getCode(), ccl.getCountryN(),
				CountryE.getCountryE(ccl.getContinent()), ccl.getSurface(), ccl.getHead());
		System.out.println(brazil);
		//DaoCountry dao = new DaoCountry(ConnectionDatabase.getConnectionDatabase());
		dao.addCountry(brazil);
		System.out.println("Done");

	}

	public void findByName() throws IOException {

		//DaoCountry dao = new DaoCountry(ConnectionDatabase.getConnectionDatabase());
		List<Country> countryFound = dao.findByName(ccl.getName());
		for (Country cF : countryFound) {
			System.out.println(cF);
		}
		if (countryFound.isEmpty()) {
			System.out.println("There is no such record on the list.");
		}
		ccl.goBackOptions();

	}

	public void findByCode() throws IOException {

	//	DaoCountry dao = new DaoCountry(ConnectionDatabase.getConnectionDatabase());
		List<Country> countries2 = dao.findCountryByCode(ccl.getCode2());
		System.out.println(ccl.getCode2());
		for (Country ct : countries2) {
			System.out.println(ct);
		}
		if (countries2.isEmpty()) {
			System.out.println("There is no such record on the list.");
		}
		ccl.goBackOptions();

	}

	public void listAll() throws IOException {

		//DaoCountry dao = new DaoCountry(ConnectionDatabase.getConnectionDatabase());
		List<Country> countries = dao.listAllCountries();
		System.out.println(countries);
		ccl.goBackOptions();

	}
}
