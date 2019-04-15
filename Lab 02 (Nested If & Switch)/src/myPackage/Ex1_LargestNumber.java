package myPackage;

import java.util.Scanner;

public class Ex1_LargestNumber {

    public static void main(String[] args) {
	
	/*
	 * Ask user to enter three separate numbers (and store as variables)
	 * Use nested if statement to check which number is largest
	 */

	System.out.println("Hello! Please enter your first number");
	Scanner scanner = new Scanner(System.in);
	int first = scanner.nextInt();
	System.out.println("Please enter your second number");
	int second = scanner.nextInt();
	System.out.println("Please enter your final number");
	int third = scanner.nextInt();

	{
	    if (first > second)
		if (first > third)
		    System.out.println(first);
	    if (second > first)
		if (second > third)
		    System.out.println(second);
	    if (third > first)
		if (third > second)
		    System.out.println(third);

	}
	scanner.close();
    }

}
