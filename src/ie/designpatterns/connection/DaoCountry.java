package ie.designpatterns.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import ie.designpatterns.country.Country;
import ie.designpatterns.country.CountryE;
import ie.designpatterns.country.CountryFactory;

public class DaoCountry {
	
	Database db = new ProxyConnection();//creation of the object of the class ProxyConnection
	Connection conn = db.getConnection();//calling the method implemented in the class ProxyConnection
	
	//Constructor
	public DaoCountry(Connection conn) {//initializes the connection to the database
		this.conn = conn;
}
	

	public Country addCountry(Country country) {//method to add new records to the database
		
		//query statement to insert data into the database 
		String sql = "INSERT INTO country(Code, Name, Continent, SurfaceArea, HeadOfState) VALUES (?,?,?,?,?)";

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, country.getCode());//set the values of the fist parameter
			stmt.setString(2, country.getName());//set the values of the second parameter
			stmt.setString(3, country.getContinent().toString());//set the values of the third parameter
			stmt.setFloat(4, country.getSurfaceAarea());//set the values of the forth parameter
			stmt.setString(5, country.getHeadOfState());//set the values of the fifth parameter

			stmt.execute();
			stmt.close();
			//conn.close();
		
			System.out.println("The record was saved successfully");
			
			
		} catch (SQLException e) {//catch the errors. For example, duplicated primary key.
			    if (e instanceof MySQLIntegrityConstraintViolationException) {
			        System.out.println("OPS! The code of the country already exists. Choose other.");
			    } else {
					e.getCause();
					e.printStackTrace();
					
			    }
			    
		}
		return country;//return country which was added 
		
	}

	public List<Country> listAllCountries() {//method to retrieve all the records of the database 
		List<Country> allCountries = new ArrayList<>();//creation of list to hold the objects country
		String sql = "SELECT * FROM country;";//query 

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			ResultSet result = stmt.executeQuery(sql);
			while (result.next()) {//go through each row of the database getting the values for each column
				Country country = CountryFactory.createCountry(result.getString("Code"), result.getString("Name"),
						CountryE.getCountryE(result.getString("Continent")), result.getFloat("SurfaceArea"),
						result.getString("HeadOfState"));
				allCountries.add(country);//add all the objects to the list
			}
			
		
		} catch (SQLException e) {//handle errors
			//e.printStackTrace();
			System.out.println("Error");//print the message to the user

		}
		return allCountries;//return the country list
	}

	public List<Country> findCountryByCode(String code) {//method to retrieve the country by the code
		List<Country> cn = new ArrayList<>();
		String sql = "SELECT * FROM country WHERE Code='" + code + "';";//query statement to retrieve data
		

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			ResultSet result = stmt.executeQuery(sql);//generate the table of data to represent the database set
			while (result.next()) {//go though all the records in the database
				Country country = CountryFactory.createCountry(result.getString("Code"), result.getString("Name"),
						CountryE.getCountryE(result.getString("Continent")), result.getFloat("SurfaceArea"),
						result.getString("HeadOfState"));
				cn.add(country);//add all the records into the list 
			}

		} catch (SQLException e) {//handle errors!
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;//return the list

	}

	public List<Country> findByName(String name) {//retrieve a countries by searching its name
		List<Country> countryL = new ArrayList<>();//creation of the list to hold the objects
		String sql = "SELECT * FROM country WHERE Name='" + name + "';";//query statement

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			ResultSet result = stmt.executeQuery(sql);//table of data to represent the database
			while (result.next()) {//go through the data of the database
				Country country = CountryFactory.createCountry(result.getString("Code"), result.getString("Name"),
						CountryE.getCountryE(result.getString("Continent")), result.getFloat("SurfaceArea"),
						result.getString("HeadOfState"));
				countryL.add(country);//add the objects retrieved to the list of objects

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return countryL;//return the list of objects 
	}
}
