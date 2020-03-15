package ie.designpatterns.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ie.designpatterns.country.Country;

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

}
