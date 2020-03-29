package ie.designpatterns.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import ie.designpatterns.test.Test;

public class ClientCommandLine {

	private String input;
	private String countryN, continent;
	private float surface;
	private String code, head, code2, name;
	private Scanner reader = new Scanner(System.in);
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private Test test;
	
	public ClientCommandLine(Test test) {
		this.test = test;
	}
	
	public void showOptions() {
		

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

			if (input.matches("[1-9]+")) {
				if (input.equals("1")) {
					System.out.println("The information will be loaded.");
					test.listAll();
					
				}
				if (input.equals("2")) {
					System.out.println("Please, insert the code of the country:");
					code2 = reader.nextLine();
					System.out.println(code2);
					test.findByCode();

				}
				if (input.equals("3")) {
					System.out.println("Please, insert the name of the country:");
					name = reader.nextLine();
					System.out.println(name);
					test.findByName();

				}
				if (input.equals("4")) {
					dataToSave();
					test.addCountries();
				}

			} else {
				System.out.println("You have to insert a number between 1 to 4:");
				showOptions();
			}

		} catch (Exception e) {

		}
	}

	public void dataToSave() throws IOException {

		System.out.println("Please, type the name of the Country:");
		countryN = reader.nextLine();
		System.out.println(countryN);

		System.out.println("Please, type the code of the Country:");
		code = reader.next();
		System.out.println(code);

		System.out.println("Please, insert the area of the surface of the country:");
		surface = reader.nextFloat();
		System.out.println(surface);

		System.out.println("Please, insert the Head of state:");
		head = reader.next();
		System.out.println(head);

		System.out.println("Select the number which corresponds to the name of the continent:");
		System.out.println("1. North America");
		System.out.println("2. South America");
		System.out.println("3. Europe");
		System.out.println("4. Asia");
		System.out.println("5. Africa");
		System.out.println("6. Oceania");
		System.out.println("7. Antarctica");

		continent = in.readLine();
		System.out.println(continent);
		test.addCountries();
		goBackOptions();

	}

	public void goBackOptions() throws IOException {

		System.out.println("Do you want to return to the main menu (Y/N)?");

		String answer = in.readLine();
		boolean validAnswer = false;
		do {

			if ((answer.equals("Y")) || (answer.equals("y"))) {
				showOptions();
				validAnswer = true;

			} if ((answer.equals("N")) || (answer.equals("n"))) {
				validAnswer = true;
				System.out.println("GoodBye!");
				

			} else {
				System.out.println("Please, select one option:");
				goBackOptions();
				validAnswer = false;
			}

		} while (validAnswer == false);

	}

	public String getCountryN() {
		return countryN;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;

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

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getCode2() {
		// TODO Auto-generated method stub
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
