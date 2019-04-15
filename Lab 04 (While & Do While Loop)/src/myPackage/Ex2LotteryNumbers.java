package myPackage;

import java.util.Scanner;

public class Ex2LotteryNumbers {

    public static void main(String[] args) {
	
	/*
	 * Create a programme which checks lottery numbers
	 * Uses four while loops, to store each user input
	 * Uses an if statement following each loop, to validate user input against stored value
	 * Total counter updated if any of the numbers match
	 * After loops have completed, use further three if statements, to check total and print output
	 */
	
	//declare variables for input number, lottery number & total (guessed right)
	int number1 = 0;
	int number2 = 0;
	int number3 = 0;
	int number4 = 0;
	int lottery1 = 1;
	int lottery2 = 9;
	int lottery3 = 7;
	int lottery4 = 4;	
	int total = 0;
		
	//Repeated code block, captures the input number
	System.out.println("What is your first number");
	Scanner scanner = new Scanner(System.in);
	number1 = scanner.nextInt();
		
	//Repeated while loop, to ensure number is between 1 and 99
	while(number1 <1 || number1 >99)
		
	{
	    System.out.println("Please try again");
	    number1 = scanner.nextInt();
	}
		
	//Repeat if statement, to check if the number guess was right, i.e. if the guess was right, 'add 1' to the counter
	if(number1 == lottery1)
	total++;

	System.out.println("What is your second number");
	number2 = scanner.nextInt();
		
	while(number2 <1 || number2 >99)
		
	{
	    System.out.println("Please try again");
	    number2 = scanner.nextInt();
	}
		
	if(number2 == lottery2)
	total++;
		
	System.out.println("What is your third number");
	number3 = scanner.nextInt();
		
	while(number3 <1 || number3 >99)
		
	{
	    System.out.println("Please try again");
	    number3 = scanner.nextInt();
	}
		
	if(number3 == lottery3)
	total++;
		
	System.out.println("What is your final number");
	number4 = scanner.nextInt();

	while(number4 <1 || number4 >99)
		
	{
	    System.out.println("Please try again");
	    number4 = scanner.nextInt();	
	}	
		
	if(number4 == lottery4)
	{
	    total++;
	}
		
	//Code block, to check if all numbers are correct
	if(number1 == lottery1 && number2 == lottery2 && number3 == lottery3 && number4 == lottery4)
	{
	    System.out.println();
	    System.out.println("You have won the lottery!");
	}
		
	//Code blocks to tell the user how many guesses were correct	
		
	if(total >0 && total <=3)
	{
	    System.out.println("You guessed " + total + " numbers correctly");
	}
	
	if(total == 1)
	{
	    System.out.println("You guessed 1 number correctly");
	}
	
	else
	{
	    System.out.println("Sorry, you didn't guess any numbers correctly");
	}
		
	scanner.close();
		
    }
	
}



