package myPackage;

public class FizzBuzz {

    public static void main(String[] args) {
	
	/*
	 * Create a programme which prints certain words when certain conditions are met
	 * Fizz, Buzz or Fizzbuzz
	 * Print Fizz when value of i is 0 remainder of 15 
	 * Print Buzz when value of i is 0 remainder of 3
	 * Print FizzBuzz when value of i is 0 remainder of 5
	 * If none of the above, print the value of i
	 */
		
	for(int i = 1; i <= 100; i++) //counter starts at 1, finishes at 100 and increases by 1 each loop
	{
	    if (i % 15 == 0) //i.e. i = 15, 30, 45..90
	    {
		System.out.println("FizzBuzz");
	    } 	
	    else if (i % 3 == 0) //i.e. i = 3, 6, 9..99
	    {
		System.out.println("Fizz");
	    }
	    else if (i % 5 == 0) 
	    {
		System.out.println("Buzz"); //i.e. i = values of 5, but not 0 remainders of 15 or 3
	    } 	
	    else
		System.out.println(i); //value of i where none of the three previous algorithms have been met
		
	}
		
    }

}

