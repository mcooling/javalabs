package myPackage;

public class Ex1CalculatorUtils {

/*
 * Creates a set of methods to add, subtract, divide & multiply
 * Use return statements for each method
 * Add print line statements to main method, to print outputs from method calls	
 */
	
	
	public static void main(String[] args) {
	
	//create variables in the main method, for a & b	
	double a = 2;
	double b = 4;
	
	//add print line statements with method calls for each calc
	//pass a & b variables in each call
	System.out.println(add(a,b));
	System.out.println(subtract(a,b));
	System.out.println(divide(a,b));
	System.out.println(multiply(a,b));
	}

	//return statements for each method, with a return statement for the function calc
	public static double add(double a, double b) {
		return a + b; //simple algorithm for add
	}
	
	public static double subtract(double a, double b) {
		return a - b; //simple algorithm for sub
	}
	
	public static double divide(double a, double b) {
		return a / b; //simple algorithm for divide
	}
	
	public static double multiply(double a, double b) {
		return a * b; //simple algorithm for multiply
	}
		
}
