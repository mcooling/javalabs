package myPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException; 
//import exception type so it can be used by the catch rule

import java.util.Scanner;

public class Ex1MarkCheckerException 

/* Reuses Mark Checker exercise from Lab 9
 * FileNotFound Exception thrown when trying to read from the input file marks.txt
 * This is because the file isn't in the programme folder
 * Add Exception Handling (try-catch) to handle the exception thrown
 * Return a user friendly message informing them that the file could not be found.
 * N.B., because you are now catching the exception you can remove “throws exception” from header
 * Test your exception handling by inputting a non-existing filename
 * */

{

    public static void main(String[] args) //throws FileNotFoundException
    
    {
	try //wraps exception handling around the code which throws the exception
	{
	
	    Scanner scanner = new Scanner(new FileInputStream("marks.txt")); 
	    //without exception handling, exception would be thrown as there is no file present
	    
	    int intCounter = 0; //records how many marks have been read (using a counter variable)  
	    double dblTotalMarks = 0; //variable to store total number of marks
	
	    while(scanner.hasNextLine()) //writes a program to read in a list of marks from a file
	
	    {    
		intCounter++; //adds to the counter at each loop
		dblTotalMarks += scanner.nextDouble(); 
		//records the total of marks as it reads each line (using a total variable)
	    }
	  
	double dblAverageMark = dblTotalMarks / intCounter; 
	//calculates the average then inform the user of their grade
	
	System.out.println("The number of answers provided was " + intCounter);
	System.out.println("Your total score was " + dblTotalMarks);
	System.out.println("Your average mark is " + dblAverageMark);
	
	scanner.close();
	
	}
	
	//adds the catch rule, including the exception type and message to be printed
	catch (FileNotFoundException fileNotFoundException)
	{
	    System.out.println("The input file for this programme could not be found");
	}
	
    }       
	    
}

