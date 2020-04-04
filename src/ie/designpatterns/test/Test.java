package ie.designpatterns.test;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import ie.designpatterns.client.ClientCommandLine;
import ie.designpatterns.connection.DaoCountry;
import ie.designpatterns.connection.Database;
import ie.designpatterns.connection.ProxyConnection;
import ie.designpatterns.country.Country;
import ie.designpatterns.country.CountryE;
import ie.designpatterns.country.CountryFactory;

public class Test {//This class will be responsible to be the interaction between the DAO class and the command line class
//It connects to the database and call the DAO to perform the operations 
	ClientCommandLine ccl = new ClientCommandLine(this);
	Database db = new ProxyConnection();//creation of the object of the class ProxyConnection
	Connection conn = db.getConnection();//calling the method implemented in the class ProxyConnection
	DaoCountry dao = new DaoCountry(db.getConnection());//the connection as the parameter in the constructor of DAO class

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new Test();

	}

	public Test() throws IOException {
		ccl.showOptions();//call the menu options to be presented to the user. 

	}

	public void addCountries() {//method to add new records to the database
		//create new object of type country by calling the factory class
		Country brazil = CountryFactory.createCountry(ccl.getCode(), ccl.getCountryN(),
				CountryE.getCountryE(ccl.getContinent()), ccl.getSurface(), ccl.getHead());//call the method in the factory class 
		System.out.println(brazil);
		dao.addCountry(brazil);//call the addCountry method in the DAO class 
	}
		

	public void findByName() throws IOException {//METHOD TO FIND COUNTRY BY ITS NAME
		////CREATION OF LIST OF COUNTRIES
		List<Country> countryFound = dao.findByName(ccl.getName()); //CALLING THE METHOD IMPLEMENTED IN DAO CLASS
		for (Country cF : countryFound) {//GO THROUGH EACH OBJECT IN DATABASE WHICH HAS THE SAME NAME
			System.out.println(cF);//PRINT THE LIST CREATED IN THE BEGINNING
		}
		if (countryFound.isEmpty()) {//VALIDATION IN CASE THERE IS NO OBJECTS WITH THE SEARCHED NAME
			System.out.println("There is no such record on the list.");
		}
		ccl.goBackOptions();//RETURN TO THE MENU OPTIONS 

	}

	public void findByCode() throws IOException {//METHOD TO FIND COUNTRY BY ITS CODE

		List<Country> countries2 = dao.findCountryByCode(ccl.getCode2());//calling the method in the DAO class
		for (Country ct : countries2) {//FOR EACH COUNTRY THERE IS A CORRESPONDENT ELEMENT 
			System.out.println(ct);//PRINT LIST WITH THE ELEMENTS
		}
		if (countries2.isEmpty()) {//IF THERE IS NO ELEMENT ON THE LIST, IT MEANS ITS IS EMPTY.
			System.out.println("There is no such record on the list.");//MESSAGE TO THE USER
		}
		ccl.goBackOptions();//CALL METHOD TO THE MENU IN THE COMMAND LINE

	}

	public void listAll() throws IOException { //METHOD TO LIST ALL THE COUNTRIES IN THE DATABASE

		List<Country> countries = dao.listAllCountries();//call for the method in the DAO class
		for (Country c : countries) {
		System.out.println(c);//print the elements in the list countries 
		}
		if(countries.isEmpty()) {//verify if there is no elements in the database 
			System.out.println("There is no records is the database");//print the message to the user
		}
		ccl.goBackOptions();//bring the user back to the menu options 

	}
}
