package myPackage;

public class TenGreenBottles {

    public static void main(String[] args) {
	
	/*
	 * Programme to print the words to 'ten green bottles'
	 * Uses a decreasing for loop, with algorithms for three if-else statements
	 */
		
	for(int i = 10; i >=0; i--) //for loop starts at 10, finishes at 0 and decreases by 1 each loop
	{
	    if(i > 2) //inner loop algorithm from '10 to 3 green bottles', i.e. runs 8 times
	    {
		System.out.println(i + " green bottles, standing on a wall");
		System.out.println(i + " green bottles, standing on a wall");
		System.out.println("And if one green bottle, should accidentally fall");
		System.out.println("There are " + (i - 1) + " green bottles, standing on a wall"); //uses (i - 1)
		System.out.println();
	    }
			
	    else if(i == 2) //inner loop algorithm for the penultimate line, i.e. only runs once
	    {
		System.out.println(i + " green bottles, standing on a wall");
		System.out.println(i + " green bottles, standing on a wall");
		System.out.println("And if one green bottle, should accidentally fall");
		System.out.println("There is one green bottle, standing on a wall");
		System.out.println();
	    }
			
	    else if(i == 1) //inner loop algorithm for the final line, i.e. only runs once
	    {
		System.out.println(i + " green bottle, standing on a wall");
		System.out.println(i + " green bottle, standing on a wall");
		System.out.println("And if one green bottle, should accidentally fall");
		System.out.println("There are no more bottles, standing on a wall");
	    }
		
	}

    }

}
