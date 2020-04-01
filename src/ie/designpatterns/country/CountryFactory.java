
package ie.designpatterns.country;
//this class is the factory design pattern to create new country objects 
public class CountryFactory {

	public static Country createCountry(String code, String name, CountryE continent, float area, String head) {

		Country country = null;

		switch (continent) {//it creates the objects according to their continent 

		case NORTH_AMERICA://ENUM class Country
			country = new CountryObjects(code, name, continent, area, head);
			break;

		case SOUTH_AMERICA://ENUM class Country
			country = new CountryObjects(code, name, continent, area, head);
			break;

		case AFRICA://ENUM class Country
			country = new CountryObjects(code, name, continent, area, head);
			break;

		case ASIA://ENUM class Country
			country = new CountryObjects(code, name, continent, area, head);
			break;

		case OCEANIA://ENUM class Country
			country = new CountryObjects(code, name, continent, area, head);
			break;

		case EUROPE://ENUM class Country
			country = new CountryObjects(code, name, continent, area, head);
			break;

		case ANTARCTICA://ENUM class Country
			country = new CountryObjects(code, name, continent, area, head);
			break;
		}

		return country;//return the object country created.
	}
}
