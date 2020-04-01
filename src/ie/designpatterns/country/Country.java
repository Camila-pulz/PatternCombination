package ie.designpatterns.country;


public abstract class Country {//abstract class that contains the attributes of the objects country
	
	private String code;//code of the country
	private String name;//name of the country
	private CountryE continent;//continent
	private float surfaceAarea;//surface 
	private String headOfState;//head of state
	

	//constructor
	public Country(String code, String name, CountryE continent, float area, String head) {
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.surfaceAarea = area;
		this.headOfState = head;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurfaceAarea(float surfaceAarea) {
		this.surfaceAarea = surfaceAarea;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public float getSurfaceAarea() {
		return surfaceAarea;
	}

	public String getHeadOfState() {
		return headOfState;
	}
	
	public CountryE getContinent() {
		return continent;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + ", continent=" + continent + ", surfaceAarea="
				+ surfaceAarea + ", headOfState=" + headOfState + "]";
	
	
	}

	



	

	
	


	

}
