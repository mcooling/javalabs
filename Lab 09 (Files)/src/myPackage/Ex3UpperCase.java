package myPackage;

import java.io.FileInputStream;
import java.util.Scanner;

public class Ex3UpperCase 
{

/* write a programme which takes input from a file (use file from Ex 2)
 * convert contents to uppercase (remember String methods)
 * displau results in the console (System.out.println) 
 */
    
    public static void main(String[] args) throws Exception
    
    {
	//take input from file (use file from Ex2)
	Scanner scanner = new Scanner(new FileInputStream("enumerate.txt"));
	
	while(scanner.hasNextLine()) //while loop to cycle through each line in .txt
		
	{    
	    //use .toUpperCase() library method to convert each line item to upper case
	    String upperCase = scanner.nextLine().toUpperCase(); //create new variable
	    System.out.println(upperCase); //print new variable
	}
	
	scanner.close(); //close scanner resources
	
    }

}
