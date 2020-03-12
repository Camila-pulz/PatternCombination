package ie.designpatterns.country;

public enum CountryE {
	
	NORTH_AMERICA(1,"North America"),
	SOUTH_AMERICA(2,"South America"),
	ANTARTICA(3,"Antartica"),
	EUROPE(4,"Europe"),
	ASIA(5,"Asia"),
	AFRICA(6,"Africa"),
	AUSTRALIA(7,"Australia");
	
	private final int id;
	private final String continent;
	
	
	
	private CountryE(int id, String continent) {
		this.id = id;
		this.continent = continent;
		
	}
	
	public static CountryE getCountryE(int code) {
		for(CountryE country : values()) {
			if(country.getId() == code) {
				return country;
			}
		}
		return null;
	}

	public int getId() {
		return id;
	}

	public String getContinent() {
		return continent;
	}

}
