package ie.designpatterns.country;

public enum CountryE {

	NORTH_AMERICA(1, "North America"), SOUTH_AMERICA(2, "South America"), EUROPE(3, "Europe"), ASIA(4, "Asia"),
	AFRICA(5, "Africa"), OCEANIA(6, "Oceania"), ANTARCTICA(7, "Antarctica");

	private final String continent;
	private final int code;

	private CountryE(int cod, String continent) {
		this.code = cod;
		this.continent = continent;

	}

	public String getContinent() {
		return continent;
	}

	public int getCode() {
		return code;
	}

	public static CountryE getCountryE(String continent) {

		for (CountryE countries : values()) {
			if (countries.getContinent().equals(continent)) {
				return countries;
			}
		}
		return null;

	}
}
