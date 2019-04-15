package myPackage;

public class EvenNumbers 
{

    public static void main(String[] args) {
	
	/*
	 * Create a for loop, which starts at 2 and increments by 2 after each loop
	 * Loop completes when the counter reaches 20
	 * Calculate the total counter value after each loop
	 * Print the value of counter after each loop
	 * Print the total counter value when loop completes
	 */
	
	//create variable to store the total value of numbers counted
	int total = 0;
	
	//counter starts at 2; test completes when counter = or < 20; value of i increased by 2 after each loop
	for(int i = 2; i <=20; i = i + 2)
	{
	    System.out.println(i); //prints the value of i on a new line, after each loop
	    total = total + i; //updates the total count, after each loop
	}
	
	System.out.println();
	System.out.println("Total value of numbers counted is: " + total); //prints the total count once loop completes
		
    }
}
