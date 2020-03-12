package ie.designpatterns.country;

public enum CountryE {
	
	NORTH_AMERICA("North America"),
	SOUTH_AMERICA("South America"),
	ANTARTICA("Antartica"),
	EUROPE("Europe"),
	ASIA("Asia"),
	AFRICA("Africa"),
	AUSTRALIA("Australia");
	
	//private final int id;
	private final String continent;
	
	
	private CountryE(String continent) {
		//this.id = id;
		this.continent = continent;
		
	}
	
	public String getContinent() {
		return continent;
	}
	
	public static CountryE getCountryE(String continent) {
		
		for(CountryE countries: values()) {
			if(countries.getContinent().equals(continent)){
				return countries;	
			}
		}
		return null;
		
	}
	
	

}
