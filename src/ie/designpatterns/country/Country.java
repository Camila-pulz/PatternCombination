package ie.designpatterns.country;

public abstract class Country {
	
	private String name;
	private float surfaceAarea;
	private char headOfState;
	private CountryE continent;
	
	
	
	public CountryE getContinent() {
		return continent;
	}
	
	
	public Country(String name, float area, char head, CountryE continent) {
		this.name = name;
		this.surfaceAarea = area;
		this.headOfState = head;
		this.continent = continent;
		
		
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
		return "Country [name=" + name + ", surfaceAarea=" + surfaceAarea + ", "
				+ "headOfState=" + headOfState
				+ ", continent=" + continent + "]";
	}
	
	}
	
