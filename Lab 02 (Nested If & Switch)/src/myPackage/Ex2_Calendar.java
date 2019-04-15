package myPackage;
import java.util.Scanner;

public class Ex2_Calendar {

    public static void main(String[] args) {
	
	/*
	 * Ask user to enter month as a number
	 * Use nested if-else statement to validate number against number of days in each month
	 * Use == and && operators
	 * Print output as the number of days in the month entered
	 */
	    
	 
	System.out.println("Hello! Please enter a number from 1 to 12");
	Scanner scanner = new Scanner(System.in);
	int month = scanner.nextInt();

	{
	if(month == 9 || month == 4 || month == 6 || month == 11)  
	    System.out.println(30);
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)  
		    System.out.println(31);
			
	else
	    System.out.println(28);	
	}		
		
	scanner.close();
	
    }

}
