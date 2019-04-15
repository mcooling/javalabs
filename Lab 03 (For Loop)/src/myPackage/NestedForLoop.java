package myPackage;

public class NestedForLoop {

    public static void main(String[] args) 
    {
	    
	// Prints a triangle of stars on screen
	
	// uses nested for-loop
	// outer loop sets the counter for each row and updates value of variable (i) each loop
	// inner loop prints number of stars on each row
	// print new line
	
	// run in pythontutor.com to visualise each loop
		
	//outer loop, sets the number of rows
	
	for(int i = 1; i <= 5; i++) //starts at 1, ends at 5, increases by 1 each loop
	{
	    //inner loop, prints the number of stars on each row	
	    
	    for(int j = 1; j <= i; j++) 
		//starts at 1, ends when value of j equals current value of i, increases by 1 each loop
	    {
		System.out.print("* "); //prints "* " after each loop, on the same line
	    }
	    
	    System.out.println(); //prints a new line, before going through next outer loop
	    
	}
    }	
}

