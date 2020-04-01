package ie.designpatterns.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import ie.designpatterns.test.Test;

public class ClientCommandLine {
	//This class is responsible to provide the interaction with the user and validate its answers accordingly.

	private String input;// variable that holds the value of the input for menu selection
	private String countryN, continent;// it holds the country name and the continent
	private float surface;// value of the surface of the country
	private String code, head, code2, name; // values of the the input related to the code of the country, head of state
	private Scanner reader = new Scanner(System.in);// scanner to read the user input
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));// bufferedReader also used!
	private Test test;// class test that contains the methods which perform the operations

	// Constructor of the class Client which also initializes the class test
	public ClientCommandLine(Test test) {
		this.test = test;
	}

	public void showOptions() throws IOException {// method that shows the menu options for the users

		System.out.println("Please, select one of the options:");
		System.out.println("1. List all the countries in the database");
		System.out.println("2. Find a country by country code");
		System.out.println("3. Find a country by name");
		System.out.println("4. Save a new country in the database");
		userInput();// read user input and validate
	}

	public void userInput() throws IOException {// this method reads and handle the input from the user after validating
												// it.

		input = reader.nextLine();// value of the user input read by scanner

		if (input.matches("[1-4]+")) {// validate user input
			if (input.equals("1")) {
				System.out.println("The information is being loaded....");
				test.listAll();// call the method on the Test class to operate with the database

			}
			if (input.equals("2")) {
				boolean valid = false;
				do {
					System.out.println("Code of the country (AT LEAST 1 CHARACTER AND NOT MORE THAN 3):");
					code2 = reader.nextLine();// read the input
					if (code2.trim().length() > 0 && code2.trim().length() < 4) {// VALIDATE THE INPUT
						valid = true;
						System.out.println(code2);
						test.findByCode();// call the method on the Test class to operate with the database
					} else {
						System.out.println("OPS!Try again:");
					}
				} while (valid == false);
			}

			if (input.equals("3")) {
				boolean valid1 = false;
				do {
					System.out.println("Name of the country (AT LEAST 1 CHARACTER!):");
					name = reader.nextLine();// read the input
					if (name.trim().length() > 0) {// validate input
						valid1 = true;
						System.out.println(name);
						test.findByName();// call the method on the Test class to operate with the database
					} else {
						System.out.println("OPS!Try again:");
					}
				} while (valid1 == false);
			}

			if (input.equals("4")) {
				dataToSave();// method to get the data to be saved in the database
			}

		} else {
			System.out.println("INSERT A NUMBER BETWEEN 1 TO 4:");
			showOptions();// recall the method while the input is not correct.
		}
	}

	public void dataToSave() throws IOException {

		boolean valid = false;
		boolean valid1 = false;
		boolean valid3 = false;
		
		do {
			System.out.println("Name of the Country (AT LEAST 1 CHARACTER):");
			countryN = reader.nextLine();
			if (countryN.trim().length() > 1) {// validate the input
				valid = true;
				System.out.println(countryN);
			} else {
				System.out.println("OPS!Try again:");
			}
		} while (valid == false);
	
		
		do {
			System.out.println("Code of the Country:");
			code = reader.nextLine();// read the inpuT
			if((code.trim().length() > 0) && (code.trim().length() < 4)){
				valid1 = true;
				System.out.println(code);
			}else {
				System.out.println("OPS!Try again:");
			}
		}while(valid1 == false);
	

		do {
			System.out.println("Please, insert the area of the surface of the country:");
			surface = reader.nextFloat();// read the input
			if (surface != 0.0f) {
				valid3 = true;
				System.out.println(surface);
			} else {
				System.out.println("OPS!Insert the value again:");
			}
		} while (valid3 == false);

		System.out.println("Please, insert the Head of state:");
		head = reader.next();// read the input
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
		// method that allows the user to go back to the main menu to choose more
		// options or exit the program.

		System.out.println("Do you want to return to the main menu (Y/N)?");

		String answer = in.readLine();
		boolean validAnswer = false;
		do {

			if ((answer.equals("Y")) || (answer.equals("y"))) {// validation
				showOptions();
				validAnswer = true;

			}
			if ((answer.equals("N")) || (answer.equals("n"))) {// validation
				validAnswer = true;
				System.out.println("GoodBye!");

			} else {
				System.out.println("Please, select one option:");
				goBackOptions();// recall the method
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
