package myPackage;
import java.util.Scanner;

public class Ex2_BabyBoomer {

public static void main(String[] args) {
    
    /*
     * Programme to decide if a person is a 'baby boomer' or not, based on birth year
     * Create a scanner class to take user input
     * Use the && operator, to create an algorithm for year range
     * If-else statement to print output based on the year range calculation
     */

	System.out.println("Hello! Please enter your age");
	Scanner scanner = new Scanner(System.in);
	int myAge = scanner.nextInt();
	int birthYear = 2017 - myAge;
				
	if(birthYear >= 1945 && birthYear <= 1964) 
	{
	    System.out.println("Hey, you're a baby boomer!");
	}
	
	else
	{
	    System.out.println("Sorry dude, you're not a baby boomer!");
	}	
		
	scanner.close();
		
	}

}
