package ie.designpatterns.country;

import ie.designpatterns.client.ClientCommandLine;

public class CountryFactory {
	

	public static Country createCountry(String name, float area, char head, CountryE continent) {
		
		Country country = null;
		ClientCommandLine cmd = new ClientCommandLine();
		
		switch(continent) {
		
		case NORTH_AMERICA:
			country = new CountryObjects(name,area,head,continent);
			break;
			
		case SOUTH_AMERICA:
			country = new CountryObjects(name,area,head,continent);
			break;
			
			
		case AFRICA:
			country = new CountryObjects(name,area,head,continent);
			break;
			
		case ASIA:
			country = new CountryObjects(name,area,head,continent);
			break;
			
		case AUSTRALIA:
			country = new CountryObjects(name,area,head,continent);
			break;
			
		case EUROPE:
			country = new CountryObjects(name,area,head,continent);
			break;
		}	


		return country;
	}
}

