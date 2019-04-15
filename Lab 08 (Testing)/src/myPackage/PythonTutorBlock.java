package myPackage;

public class PythonTutorBlock 
//change class to StringArrayUtils in Python tutor
//also remove the StringArrayUtils class reference at line 22...don't need it, as the method is within the class

{
    public static void main(String[] args) 
    	
    {
		

	//test getMaxLength() and getMinLength()
	//write tests for max length and min length. Consider how the program might fail, e.g. edge tests
	//use test headers input, output, reason
	//write the tests in the main method

	//test getMaxLength()	
		
		String [] input = {"abcdefg"};
		int expectedOutput = 7;
		int actualOutput = StringArrayUtils.getMaxLength(input);
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
    
    public static int getMaxLength(String [] stringArray)
	  {
	    //set maxLengthString as an initial value
	    int maxLengthString = 0;
	    
	    //check every string to see if it is shorter than the initial value
	    for(int i = 1; i < stringArray.length; i++)
	    {
	      String string = stringArray[i];
	      if(string.length() > maxLengthString)
	      {
	        //update maxLengthString when a longer string is found
	        maxLengthString = string.length();
	      }//if
	    }//for string
	    
	    //return the length of the longest string
	    return maxLengthString;
	  }//method - getMaxLength
	  
	  //This method will tell the user the length of the shortest string in an array 
	  // of Strings
	  //stringArray is a non-null array of Strings with no null elements
	  //returns the length of the shortest string
	    
}

