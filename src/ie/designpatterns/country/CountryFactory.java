package ie.designpatterns.country;
public class CountryFactory {
	

	public static Country createCountry(String name, float area, char head, CountryE continent) {
		
		Country country = null;
		//ClientCommandLine cmd = new ClientCommandLine();
		
		//cmd.getContinent();
		
		switch(continent){
		
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
			
		case OCEANIA:
			country = new CountryObjects(name,area,head,continent);
			break;
			
		case EUROPE:
			country = new CountryObjects(name,area,head,continent);
			break;
		
		case ANTARCTICA:
		country = new CountryObjects(name,area,head,continent);
		break;
	}	
		

		return country;
	}
}

