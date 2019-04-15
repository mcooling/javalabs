package myPackage;

import java.util.Scanner;

public class Ex3_CalendarSwitch {

    public static void main(String[] args) {
	
	/*
	 * Extends on the calendar programme
	 * replaces the nested if-else with a switch statement
	 * if-else algorithm replace by 'case', where case number equals the variable number entered i.e. (month)
	 * when the switch rule applies, switch terminates through the given 'break' statement
	 * all switch statements require a 'default', to handle an invalid case entered
	 * 
	 */
	
	//switch statements can only be used where a single variable is being checked in a condition
	//in this example, the single variable being checked is month
		
	System.out.println("Hello! Please enter a number from 1 to 12");
	Scanner scanner = new Scanner(System.in);
	int month = scanner.nextInt();
		
	{
	    switch (month) 
	    {
	    	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		System.out.println(31); break;
			
	    	case 2:
		System.out.println(28); break;
			
	    	case 4: case 6: case 9: case 11:
		System.out.println(30); break;
			
	    	default:
		System.out.println("You haven't entered a number from 1 to 12. Try again."); break;
	    }
		
	}		
		scanner.close();
    }

}