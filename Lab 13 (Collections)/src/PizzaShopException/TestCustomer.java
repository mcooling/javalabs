package PizzaShopException;

import java.util.Scanner;

//import J2SProgrammes.Oblong;

public class TestCustomer 

{

    public static void main(String[] args) 
    
    {
	
	/*
	 * Write a new class with one main method called ‘TestCustomer.java’
	 * This class should create several customers with different values
	 * Use the separate Customer object class
	 * Use the toString method to print out the state of the variables for each new customer object
	 */
		
		Scanner keyboard = new Scanner(System.in);

	        // declare two variables to hold the customer name and address as input by the user 
	        String customerName, customerAddress;

	        // now get the values from the user
	        System.out.print("Please enter the name of your customer: ");
	        customerName = keyboard.nextLine();
	        System.out.print("Please enter the address of your customer: ");
	        customerAddress = keyboard.nextLine();
	        
	        // declare a constructor for the Customer object
	        // note. this has to be declared AFTER the customerName and customerAddress variables are stored
	        Customer myCustomer = new Customer(customerName, customerAddress);

	        // the toString method is written in the object class, but called from the main method
	        
	        System.out.println();
	        System.out.println(myCustomer.toString());
	        keyboard.close();
	
    }

}
