package myPackage;

import java.util.Scanner;

public class Ex1PasswordChecker {

    public static void main(String[] args) {
	
	/*
	 * Programme to check password entered by user
	 * Create variables for password and password entered
	 * Add a while loop to check if the two values match
	 */

	System.out.println("What is your password");
	Scanner scanner = new Scanner(System.in);
	String myPassword = "baxter"; //correct password
	String password = scanner.nextLine(); //user entered password
		
	while(!myPassword.equals(password)) 
	    //while loop condition uses .equals method, with password as parameter
	    //algorithm is for a failed password, so the !myPassword operator is used
	{
	    System.out.println("Please try again");
	    password = scanner.nextLine();
	}
		
	System.out.println("Well done");
	scanner.close();

    }

}
