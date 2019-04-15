package myPackage;
import java.util.Scanner;

public class Ex3_ValidMobileNumber {

    public static void main(String[] args) {
	
	/*
	 * Programme to decide if a mobile number is valid, based on number of digits
	 * Ask user to enter mobile number
	 * Use .length() method to determine length of number added
	 * Create algorithm to validate the number
	 * Algorithm uses .startsWith() method and && operator
	 * If-else statement to print output
	 */

	System.out.println("Hello! Please enter your mobile number");
	Scanner scanner = new Scanner(System.in);
	String myMobile = scanner.nextLine();
	int mobileLength = myMobile.length();
		
	if(myMobile.startsWith("07") && mobileLength == 11)
	{
	    System.out.println("Cheers mate, your mobile number is sound");
	}
	else
	{
	    System.out.println("Sorry dude, your mobile number is dodgy!");
	}	
	
	scanner.close();
		
	}

}
