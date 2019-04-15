package myPackage;
import java.io.FileInputStream;
import java.util.Scanner;

public class Ex1MarkChecker 

/*
 * create a file containing a list of 20 marks
 * Double format, one mark per line, range 1-100
 * create a text file in the code folder
 * write a program to read in a list of marks from a file
 * record how many marks have been read (using a counter variable)
 * record the total of the marks as it reads each one (using a total variable)
 * calculate the average then inform the user of their grade
 */

{

    public static void main(String[] args) throws Exception
    
    {
	Scanner scanner = new Scanner(new FileInputStream("marks.txt")); 
	//write a program to read in a list of marks from a file
	
	int intCounter = 0; //record how many marks have been read (using a counter variable)  
	double dblTotalMarks = 0;
	
	while(scanner.hasNextLine()) //write a program to read in a list of marks from a file
	
	{    
	    intCounter++; //record how many marks have been read (using a counter variable) 
	    dblTotalMarks += scanner.nextDouble(); 
	  
	  //record the total of the marks as it reads each one (using a total variable)
	}
	  
	double dblAverageMark = dblTotalMarks / intCounter; 
	//calculate the average then inform the user of their grade
	
	System.out.println("The number of answers provided was " + intCounter);
	System.out.println("Your total score was " + dblTotalMarks);
	System.out.println("Your average mark is " + dblAverageMark);	
    
	scanner.close();
	
    }       
	    
}
