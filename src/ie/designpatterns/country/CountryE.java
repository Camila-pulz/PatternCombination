package ie.designpatterns.country;

public enum CountryE {// ENUM WHICH IS ASSIGNS THE VALUES OF THE CONTINENTS TO EACH OBJECT

	ASIA("Asia"), EUROPE("Europe"), NORTH_AMERICA("North America"), AFRICA("Africa"), 
	OCEANIA("Oceania"), ANTARCTICA("Antarctica"), SOUTH_AMERICA("South America");

	private final String continent;

	// CONSTRUCTOR OF THE ENUM
	private CountryE(String continent) {
		this.continent = continent;
	}

	public String getContinent() {
		return continent;
	}
	// FOR EACH VALUE OF THE CONTINENT THERE IS A STRING VALUE ASSIGNED
	public static CountryE getCountryE(String continent) {

		for (CountryE countries : values()) {
			if (countries.getContinent().equals(continent)) {
				return countries;// RETURN THE CONTINENT
			}
		}
		return null;

	}
}
