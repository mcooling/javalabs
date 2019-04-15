package myPackage;

public class Ex1TestGetTotalLength 
{

    public static void main(String[] args) 
    {
	
	/*
	 * Test script for total length of a string array
	 * boolean variable for test success
	 * calls get.TotalLength method from StringArrayUtils class
	 * if else statement to print success or failed message
	 * failed message prints the actual and expected outcome
	 */
	
	String [] input = {"abc","a"," "};
	int expectedOutput = 3; //in this case the total length of the string array is 5. should fail
	
	//calls getTotalLength method from StringArrayUtils Class, to get the actual output
	//The string values from the string array above, are passed as the input
	int actualOutput = StringArrayUtils.getTotalLength(input); 
	boolean testSuccess = actualOutput == expectedOutput;
	
	if(testSuccess)
	{
	    System.out.println("Test 1 Success");
	}
	
	else
	{
	    System.out.println("Test 1 Failed");
	    System.out.println("Expected output was: " + expectedOutput);
	    System.out.println("Actual output was: " + actualOutput);
	}
	
	/* String [] input = {"abcdefg"};
	int expectedOutput = 7;
	int actualOutput = StringArrayUtils.getTotalLength(input); //this is a method call to getTotalLength, in the separate StringArrayUtils Class. The string value at line 43 is passed as the input param
	boolean testSuccess = actualOutput == expectedOutput;
	
	if(testSuccess)
	{
	    System.out.println("Test 1 Success");
	}
	
	else
	{
	    System.out.println("Test 1 Failed");
	    System.out.println("Expected output was: " + expectedOutput);
	    System.out.println("Actual output was: " + actualOutput);
	} */

    }
}

