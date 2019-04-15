package myPackage;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex4UpperCase2 
{

/* amend the programme UpperClass, to...
 * ask the user to enter the name of file to take input from (use enumerate.txt)
 * read input from that file    
 * ask the user for the name of the file to put output into (including .txt extension)
 * write output to that file
 */
    
    public static void main(String[] args) throws Exception
    
    {
	// write a programme which takes input from a file (use file from Ex 2)
	// convert contents to uppercase (remember String methods)
	// displau results in the console (System.out.println)
	
/* ask user for name of file to take input from
 * read program input from that file
 * obviously assumes the name of the text file is entered correctly!
 */
	
	 Scanner user = new Scanner(System.in);
	 //prompt user for file name to read from
	 System.out.println("Which file name would you like to take input from?");
	 String inputFileName = user.nextLine(); //variable to store input file name
	 Scanner input = new Scanner (new FileInputStream(inputFileName)); //reads content in from file
	 
	 Scanner output = new Scanner(System.in); //new scanner object for the output
	 //prompt user for file name to write to
	 System.out.println("Which file name would you like to output to?");
	 String outputFileName = output.nextLine(); //variable to store output file name
	 
	 PrintWriter writer = new PrintWriter(outputFileName); //open printwriter and write to file
	
	//while loop to read input from each line, convert to UC and write to new file 
	while(input.hasNextLine()) 
		
	{    
	    String upperCase = input.nextLine().toUpperCase();
	    writer.println(upperCase);
	}
	
	//need to close each I/O resource
	output.close();
	user.close();
	input.close();
	writer.close();
	
    }

}
