package myPackage;

public class NestedForLoop2 
{
	
    public static void main(String[] args) 
    
    // reverse of previous programme, i.e. print one less star on each row, until it reaches 0
    // still want 5 rows, so outer loop algorithm stays the same
    // inner loop however, we want to decrease by 1 within each outer loop
    // so we can say for each inner loop, value of j = i
    // this means the starting value of j will increase by 1, on each inner loop 
    // each inner loop will then decrease by 1 iteration each time, i.e. 5 - j
    // max number of stars to print is 5, so we can set the test condition as j <= 5 
    
    {
	for(int i = 1; i <= 5; i++)
	{
	
	    for(int j = i; j <= 5; j++) //
	    {
		System.out.print("* ");
	    }
	
	    System.out.println();
			
	}
    }
}
