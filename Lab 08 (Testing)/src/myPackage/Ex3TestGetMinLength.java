package myPackage;

public class Ex3TestGetMinLength 

{

    public static void main(String[] args) 
    
    {
	
	String [] input = {"  "};
	int expectedOutput = 2;
	int actualOutput = StringArrayUtils.getMinLength(input); //calls the minlength method from the separate StringArrayUtils Class. The string value at line 11 is passed as the input param
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
	
    }
    
}
//test getMinLength()
