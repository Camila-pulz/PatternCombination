package ie.designpatterns.country;

public class CountryFactory {

	public static Country createCountry(String code, String name, CountryE continent, float area, String head) {

		Country country = null;

		switch (continent) {

		case NORTH_AMERICA:
			country = new CountryObjects(code, name, continent, area, head);
			break;

		case SOUTH_AMERICA:
			country = new CountryObjects(code, name, continent, area, head);
			break;

		case AFRICA:
			country = new CountryObjects(code, name, continent, area, head);
			break;

		case ASIA:
			country = new CountryObjects(code, name, continent, area, head);
			break;

		case OCEANIA:
			country = new CountryObjects(code, name, continent, area, head);
			break;

		case EUROPE:
			country = new CountryObjects(code, name, continent, area, head);
			break;

		case ANTARCTICA:
			country = new CountryObjects(code, name, continent, area, head);
			break;
		}

		return country;
	}
}
