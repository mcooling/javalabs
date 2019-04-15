package myPackage;

public class Ex2TestGetMaxLength 
{

    public static void main(String[] args) 
    {
	// TODO Auto-generated method stub
	
	{
		
		String [] input = {"1","  ","abcdef"};
		int expectedOutput = 1;
		int actualOutput = StringArrayUtils.getMaxLength(input); //calls the maxlength method from the separate StringArrayUtils Class. The string value at line 12 is passed as the input param
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

}

