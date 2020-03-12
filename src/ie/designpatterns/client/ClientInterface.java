package ie.designpatterns.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientInterface {
	
	private BufferedReader in;
	private String input;
	private String countryN, surface;
	
	public ClientInterface() {
		
		System.out.println("Welcome to the system!");
		System.out.println("Please, select one of the options:");
		System.out.println("1. List all the countries in the database");
		System.out.println("2. Find a country by country code");
		System.out.println("3. Find a country by name");
		System.out.println("4. Save a new country in the database");
		ReadingInput();
		
	}
	

	public void ReadingInput() {
		
		try {
			
			in = new BufferedReader(new InputStreamReader(System.in));
			boolean validation = false;
		
		do {
			
			System.out.println("Please, insert a number:");
			input = in.readLine();
			
			if(input.equals("1")){
				validation = true;
				System.out.println("Hello1!");
				System.out.println("Would like to go back to the Menu?");
			}
			if(input.equals("2")){
				System.out.println("Hello2!");
				validation = true;	
			}
			
			if(input.equals("3")){
				System.out.println("Hello3!");
				validation = true;
			}
			if(input.equals("4")){
				validation = true;
				savingFunction();
			}
		
		}while(validation ==false);
		
		}catch(Exception e) {
	}
	}
	
	public void savingFunction() throws IOException {
		
		boolean stop = false;
		
		do {
			System.out.println("Please, insert the name of the country:");
			in = new BufferedReader(new InputStreamReader(System.in));
			countryN = in.readLine();
			if(countryN.matches("brazil") && (countryN != " ")) {
				stop = true;
				System.out.println(countryN);
				
			}
		}while(stop == false);
		
		do {
		System.out.println("Please, insert the area of the surface");
		in = new BufferedReader(new InputStreamReader(System.in));
		surface = in.readLine();
		if(surface.matches("23")) {
			stop = true;
			
		}
		}while(stop == false);
	}
	
	public static void main(String [] args) {
		new ClientInterface();
	}

	
	
}
