package ie.designpatterns.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ie.designpatterns.country.Country;
import ie.designpatterns.country.CountryE;
import ie.designpatterns.country.CountryFactory;

public class DaoCountry {

	Connection conn;

	public DaoCountry(Connection conn) {
		this.conn = conn;
	}

	public Country addCountry(Country country) {

		String sql = "INSERT INTO country(Code, Name, Continent, SurfaceArea, HeadOfState) VALUES (?,?,?,?,?)";
		Connection conn = ConnectionDatabase.getConnection();

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setLong(1, country.getCode());
			stmt.setString(2, country.getName());
			stmt.setString(3, country.getContinent().toString());
			stmt.setFloat(4, country.getSurfaceAarea());
			stmt.setLong(5, country.getHeadOfState());
			

			stmt.execute();
			stmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error");

		}

		return country;

	}
	
	public List<Country> listAllCountries(){
		List<Country> allCountries = new ArrayList<>();
		String sql="SELECT * FROM Countries;";
		
		try(PreparedStatement stmt = this.conn.prepareStatement(sql)){
			ResultSet result = stmt.executeQuery(sql);
			while (result.next()) {
				Country country = CountryFactory.createCountry(result.getLong("Code"), result.getString("Name"), 
						CountryE.valueOf(result.getString("Continent")), result.getFloat("SurfaceAarea"),
						result.getLong("HeadOfState"));
				allCountries.add(country);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.getCause();
			e.printStackTrace();
		}
		return allCountries;
		
	}

}
