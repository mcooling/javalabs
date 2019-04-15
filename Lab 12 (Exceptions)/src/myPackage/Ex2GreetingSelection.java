package myPackage;

import java.util.Scanner;

public class Ex2GreetingSelection
{   
    
/*
 * Write a programme to greet a user in 3 different ways 
 * (i.e., “hello...”, “welcome...”, etc.). 
 * use an array to store the different greetings
 * ask the user to enter a number (0, 1 or 2) depending on which greeting they wish to see
 * This number should be used as the index to the greetings array, to retrieve the appropriate greeting.
 * 
 * b. Modify the program so when the user has seen their first choice of greeting, they can select a further option.
 * N.B., you should use an infinite loop to keep presenting the user with the opportunity to select a new greeting.
 * 
 * c. If the user enters a number that is not 0, 1 or 2, an ArrayIndexOutOfBoundsException will occur
 * Add appropriate exception handling for this. 
 * Your programme should not exit if the user enters an invalid input.
    
 */
    
    
    public static void main(String[] args) 
    {
	//write a programme that greets a user in 3 different ways, e.g. “hello...”, “welcome...”, "good morning..." 
	
	//use an array to store the three different greetings
	
	String [] greeting = new String[3]; //could also write this as {"Mars", "Saturn", etc}
	
	//the variable item values have to match the variable type, e.g. String in this case
	greeting[0] = "Greeting 1 - Hello"; 
	greeting[1] = "Greeting 2 - Welcome";
	greeting[2] = "Greeting 3 - Wilkommen";
	
	
	//b. Modify the program so they can select a further option after the first choice.
	//use an infinite loop to keep presenting the user with the opportunity to select a new greeting.
	 
	//ask the user to enter a number (0, 1 or 2) depending on which greeting they wish to see
	//this number should be used as the index to the greetings array, to retrieve the appropriate greeting.
	
	//c. If the user enters a number that is not 0, 1 or 2, then an ArrayIndexOutOfBoundsException occurs
        //Add appropriate exception handling for this. 
	//Your programme should not exit if the user enters an invalid input.

	while(true) //infinite loop
	{
	    try 
	    {
        	System.out.println("Please choose a greeting, number 0, 1 or 2");
        	Scanner scanner = new Scanner(System.in);
       		int greetingOption = scanner.nextInt();
        		
       		System.out.println(greeting[greetingOption]); 
       		//prints relevant message for greeting[0],[1],[2]
        		
       		//scanner.close();
	    }
		
	    catch (ArrayIndexOutOfBoundsException exception) //catches the exception if it occurs
	    {
		System.out.println("The number is invalid"); //and does this if it does
	    }

	}
	
    }

}
	
    
    

