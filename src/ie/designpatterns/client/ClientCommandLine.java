package ie.designpatterns.client;

import java.util.Scanner;

public class ClientCommandLine {

	private String input;
	private String countryN, continent;
	private float surface;
	private char head;
	private Scanner reader = new Scanner(System.in);

	public void showOptions() {

		System.out.println("Welcome to the system!");
		System.out.println("Please, select one of the options:");
		System.out.println("1. List all the countries in the database");
		System.out.println("2. Find a country by country code");
		System.out.println("3. Find a country by name");
		System.out.println("4. Save a new country in the database");
		userInput();
	}

	public void userInput() {

		try {

			input = reader.nextLine();
			if (input.equals("1")) {

			}
			if (input.equals("2")) {

			}
			if (input.equals("3")) {

			}
			if (input.equals("4")) {
				dataToSave();
			}

		} catch (Exception e) {

		}
	}

	public void dataToSave() {

		System.out.println("Please, type the name of the Country:");
		countryN = reader.nextLine();
		System.out.println(countryN);

		System.out.println("Please, insert the area of the surface of the country:");
		surface = reader.nextFloat();
		System.out.println(surface);

		System.out.println("Please, insert the Head of state:");
		head = reader.next().charAt(0);
		System.out.println(head);

		System.out.println("Select the number which corresponds to the name of the continent:");
		System.out.println("1. North America");
		System.out.println("2. South America");
		System.out.println("3. Europe");
		System.out.println("4. Asia");
		System.out.println("5. Africa");
		System.out.println("6. Oceania");
		System.out.println("7. Antarctica");

		continent = reader.next();
		System.out.println(continent);

	}

	public String getCountryN() {
		return countryN;
	}

	public void setCountryN(String countryN) {
		this.countryN = countryN;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public float getSurface() {
		return surface;
	}

	public void setSurface(float surface) {
		this.surface = surface;
	}

	public char getHead() {
		return head;
	}

	public void setHead(char head) {
		this.head = head;
	}

//	public static void main(String[] args) {
	// TODO Auto-generated method stub
	// new ClientCommandLine();

}
