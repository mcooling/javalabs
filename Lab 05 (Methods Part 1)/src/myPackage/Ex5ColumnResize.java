package myPackage;
import java.util.Scanner;

public class Ex5ColumnResize 

/*
 * Run the programme - the columns are not properly aligned. 
 * Write a new method that aligns the columns. 
 * 	private static String columnResize(String text)
 * 
 * Convert each System.out.println statement to call the columnResize method. 
 * The method expects a String, but we have an integer, so we will need to convert it as follows:
 * 	System.out.println(columnResize(number1 + ""));
 * 
 * Column resize method should use a loop - should it be a for-loop or while-loop?
 * The loop should add a new space to the end of the string at each iteration until string is correct length. 
 * The method should then return the string.
 * Test the programme with the following set of inputs and record the results: 1,2; 10,20; 200,999
 */

{

    public static void main(String[] args) 
    {
	Scanner scanner = new Scanner(System.in); 
	System.out.println("Enter 2 numbers"); 
	int number1 = scanner.nextInt();
	int number2 = scanner.nextInt();
	
	System.out.println( 
		
		"| number 1 |"
		+ "| number 2 |"
		+ "| add      |"
		+ "| subtract |"
		+ "| times    |"
		+ "| divide   |");
	
	/*
	 * Initial code which printed the misaligned output
	 * 
	 * System.out.print("|" + number1 + "|");
	 * System.out.print("|" + number2 + "|");
	 * System.out.print("|" + (number1 + number2) + "|"); 
	 * System.out.print("|" + (number1 - number2) + "|");
	 * System.out.print("|" + (number1 * number2) + "|"); 
	 * System.out.print("|" + (number1 / number2) + "|");
	 * */
	
	//Convert each System.out.println statement to call the columnResize method. 
	//The method expects a String, but we have an integer, so we will need to convert it as follows:
	//System.out.println(columnResize(number1 + ""));
	
	System.out.print("|" + columnResize(number1 + "") + "|");
	System.out.print("|" + columnResize(number2 + "") + "|");
	System.out.print("|" + columnResize((number1 + number2) + "") + "|"); 
	System.out.print("|" + columnResize((number1 - number2) + "") + "|"); 
	System.out.print("|" + columnResize((number1 * number2) + "") + "|"); 
	System.out.print("|" + columnResize((number1 / number2) + "") + "|");
	
	scanner.close();
	
    }
    
    //Write a new method that aligns the columns. 
    //Use a while loop, to add a space to end of the string at each loop until string is correct length. 
    
    //The method should then return the string.
    
    private static String columnResize(String text)
    {
	while(text.length() < 10) //uses .length() method to determine the string length
	{
	    text = text + (" "); //each loop updates string length of text by a single space
	}
	return text; //final value of text returned to main method, when while loop completes
    }
    
    /*
     * methods below commented out. previously used when the column headers were different lengths
     * instead, I just updated the column headers to be the same length
     * 
     * private static String columnResize2(String text) { while(text.length() < 5) {
     * text = text + (" "); } return text; }
     * 
     * private static String columnResize3(String text) { while(text.length() < 7) {
     * text = text + (" "); } return text; }
     * 
     * private static String columnResize4(String text) { while(text.length() < 8) {
     * text = text + (" "); } return text; }
     */
    
}
