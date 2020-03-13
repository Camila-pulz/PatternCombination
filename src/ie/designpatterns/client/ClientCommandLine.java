package ie.designpatterns.client;

import java.io.BufferedReader;
import java.util.Scanner;

public class ClientCommandLine {
	
	//private BufferedReader in;
	private String input;
	private String countryN, continent;
	private float surface;
	private char head;
	private Scanner reader = new Scanner(System.in);
	
	public ClientCommandLine() {
		
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
			
			System.out.println("Please, insert a number:");
			input = reader.nextLine();
			if(input.equals("1")) {
				
			}if(input.equals("2")) {
				
			}if(input.equals("3")) {
				
			}if(input.contentEquals("4")) {
				dataToSave();
			}
			
			
		}catch(Exception e) {
			
		}
	}
		
		public void dataToSave() {
			
			System.out.println("insert the name of the country");
			countryN = reader.nextLine();
			System.out.println(countryN);
			
			System.out.println("insert the area of th surface");
			surface = reader.nextFloat();
			System.out.println(surface);
			
			System.out.println("insert the head of state");
			head = reader.next().charAt(0);
			System.out.println(head);
			
			System.out.println("insert the continent");
			continent = reader.nextLine();
			System.out.println(continent);
			
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClientCommandLine();

	}

}
