package myPackage;

public class Ex1PrintTable {

    public static void main(String[] args) {

	/*
	 * Programme to print a pattern on screen
	 * Combination of single use and reused println outputs
	 * Uses method statements, to print reusable output
	 * Series of specific println statements, with common println statements before and after
	 */
	
	myDash();
	mySeparator();
	System.out.println("| a | b | c | d | e |");
	mySeparator();
	myDash();
	myDash();
	mySeparator();
	System.out.println("| 1 | 2 | 3 | 4 | 5 |");
	mySeparator();
	myDash();
	myDash();
	mySeparator();
	System.out.println("| i | ii|iii| iv| v |");
	mySeparator();
	myDash();
	myDash();
	mySeparator();
	System.out.println("| r | o | y | g | b |");
	mySeparator();
	myDash();
	myDash();
	mySeparator();
	System.out.println("|jan|feb|mar|apr|may|");
	mySeparator();
	myDash();
	myDash();
	mySeparator();
	System.out.println("|gen|exo|lev|num|deu|");
	mySeparator();
	myDash();
		
	}
	
	public static void myDash() {
	//common method, to print the lines of dashes
	    System.out.println("---------------------");
	}
	
	public static void mySeparator() {
	//common method, to print the lines of separators
	    System.out.println("|   |   |   |   |   |");	
	}

}
