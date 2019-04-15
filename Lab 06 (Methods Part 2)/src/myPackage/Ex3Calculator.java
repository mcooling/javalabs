package myPackage;

import java.util.Scanner;

public class Ex3Calculator {

    public static void main(String[] args) {

/*
 * Write a new class called Calculator
 * class should contain one main method
 * asks user which operation they want to perform, then gets the numbers they wish to use
 * class should call CalculatorUtils method, to do the calcs, i.e. Ex1CalculatorUtils.add(a,b);
 * 
 * Modify the programme further
 * after displaying results, user is asked if they wish to do more calcs
 * If the user says no, programme terminates with a good-bye message)
 * otherwise, the programme should repeat
 */
	
	//we want to run the code once, then repeat as long as the user wants
	//we then need a way to exit the loop when the user decides
	
	boolean continueCalc = true; //set a boolean variable, to set while loop rule as true or false
	
	while(continueCalc)
	{
	
	    System.out.println("Which operation would you like to perform?");
	    Scanner scanner = new Scanner(System.in);
	    String myOperation = scanner.nextLine();
	
	    //ask the user which two numbers they want to use, storing the responses in variables a, b
	    System.out.println("What is your first number?");
	    double a = scanner.nextDouble();
	    System.out.println("What is your second number?");
	    double b = scanner.nextDouble();

	    //use an if statement to check the operation the user wants
	    //then call the CalculatorUtils method to give the response  
	
	    if(myOperation.equals("add")) 
	    {
		System.out.println("Your number is: " + Ex1CalculatorUtils.add(a,b));
	    }
	
	    if(myOperation.equals("subtract")) 
	    {
		System.out.println("Your number is: " + Ex1CalculatorUtils.subtract(a,b));
	    }
	
	    if(myOperation.equals("divide")) 
	    {
		System.out.println("Your number is: " + Ex1CalculatorUtils.divide(a,b));
	    }
	
	    if(myOperation.equals("multiply")) 
	    {
		System.out.println("Your number is: " + Ex1CalculatorUtils.multiply(a,b));
	    }
		
	    //modify programme further, to ask user if they want to do more calculations
	    System.out.println("Would you like to do a further calculation?");
	    String moreCalc = scanner.next();
	
	    //if statement to end the loop, i.e. if the user chooses 'no'
	    //no else is required as boolean default is set to true and default is to loop back round
	    if(moreCalc.equals("no")) 
	    {
		System.out.println("Okay, goodbye");
		continueCalc = false; //setting boolean to false allows us to exit the loop
	    }
	
	    scanner.close();
	}
	
    }

}
