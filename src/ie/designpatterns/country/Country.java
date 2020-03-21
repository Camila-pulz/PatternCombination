package ie.designpatterns.country;

import java.util.Arrays;

public abstract class Country {
	
	
	private String code;
	private String name;
	private CountryE continent;
	private float surfaceAarea;
	private String headOfState;
	

	public CountryE getContinent() {
		return continent;
	}

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

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + ", continent=" + continent + ", surfaceAarea="
				+ surfaceAarea + ", headOfState=" + headOfState + "]";
	
	
	}

	



	

	
	


	

}
