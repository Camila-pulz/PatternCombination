package ie.designpatterns.country;

public abstract class Country {
	
	
	private char code;
	private String name;
	private CountryE continent;
	private float surfaceAarea;
	private char headOfState;
	

	public CountryE getContinent() {
		return continent;
	}

	public Country(char code, String name, CountryE continent, float area, char head) {
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

	public void setHeadOfState(char headOfState) {
		this.headOfState = headOfState;
	}

	public char getCode() {
		return code;
	}

	public void setCode(char code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public float getSurfaceAarea() {
		return surfaceAarea;
	}

	public char getHeadOfState() {
		return headOfState;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + ", continent=" + continent + ", surfaceAarea="
				+ surfaceAarea + ", headOfState=" + headOfState + "]";
	}



	

	
	


	

}
