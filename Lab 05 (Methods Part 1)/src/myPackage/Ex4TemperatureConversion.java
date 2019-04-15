package myPackage;

import java.util.Scanner;

public class Ex4TemperatureConversion {
	
public static void main (String[] args) {

/* 
 * Programme to convert celcius to fahrenheit and vice versa
 * PrintTable2 introduced passing data into a method call
 * This introduces returning data from a method, back to the main method 
 * Creates two methods with conversion algorithms: one for FtoC, one for CtoF
 * User required to input initial values for F and C
 * FtoC method call passes fahrenheit value (double)
 * CtoF method call passes celcius value (double)
 * Should test each program by printing the results within the main class
 * Do not include println within the methods
 */
	
    //Scanner input to enter the temp in F
    System.out.println("Enter the temperature in fahrenheit: ");
    Scanner scanner = new Scanner(System.in);

    //create two double variables. One for fahrenheit, one for celcius
	
    double myFahrenheit = scanner.nextDouble(); //Scanner input to enter the temp in F	
    double celsius = FtoC(myFahrenheit); //call the new FtoC method, passing fahrenheit as an input value
    
    //print line statement showing the conversion amount. Value for celsius is returned by the FtoC() method
    System.out.println(myFahrenheit + " fahrenheit is " + celsius + " celsius");

    //Second user input to enter temp in celcius
    System.out.println("Enter the temperature in celcius: ");

    //create two double variables. One for celcius, one for fahrenheit

    double myCelcius = scanner.nextDouble(); //Scanner input to enter the temp in C	
    double fahrenheit = CtoF(myCelcius); //call the new CtoF method, passing celcius as an input value
    
    //print line statement showing the conversion amount. Value for fahrenheit is returned by the CtoF() method
    System.out.println(myCelcius + " celcius is " + fahrenheit + " fahrenheit");

    scanner.close();
	
}

/*
 * Method function for FtoC
 * notice the @param fahr data type is the same as myFahrenheit from main method (double)
 * can be called anything, as long as it uses the same data type
 * @return algorithm has to use the same variable name though, as the one used in the method name, i.e. fahr	
 */

private static double FtoC(double fahr) {
    return (fahr - 32)*5/9; //algorithm for converting fahrenheit to celcius 
	}

//Method function for CtoF
//same rules apply as FtoC

private static double CtoF(double celc) {
    return (celc * 9/5) + 32; //algorithm for converting celcius to fahrenheit 
	}

}