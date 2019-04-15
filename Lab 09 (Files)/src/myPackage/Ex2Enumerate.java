package myPackage;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex2Enumerate 

/*
 * create a program to read a file with 5 line items
 * write the same content out to a new separate file
 * prefix each line in the new file with the line number (will need a variable counter for this)
 */

{
    public static void main(String[] args) throws Exception
    
    {
	//create a program to read a file with 5 line items
	Scanner scanner = new Scanner(new FileInputStream("enumerate.txt")); 
	
	//write the same content out to a new separate file
	//open the file name to see the new content
	PrintWriter writer = new PrintWriter("enumerate2.txt"); //introduces PrintWriter object
	
	//prefix each line in the new file with the line number 
	int lineCounter = 0; //counter to add the line number prefix 
	String lineName; //variable to store the content of each line in enumerate.txt
		
	while(scanner.hasNextLine()) //while loop to read each line from enumerate.txt
		
	{    
	    lineCounter++; //adds 1 to the line counter at each loop
	    lineName = scanner.nextLine(); //create a string variable for the value of the next line
	    writer.println(lineCounter + " " + lineName); //print the line number prefix and line name, to the new ennumerate2.txt file
		
	}
		  
	writer.close(); //close writer resources. MUST DO THIS
	scanner.close(); //close scanner resources
    
    }
	    
}
