package myPackage;

public class Ex2MethodOverload {

    /*
     * Extends the calculator utility, to include method overloading
     * Allows us to reuse methods with the same name, rather than create new ones
     * Useful where the logic is same but the inputs are different
     * Creates additional add() and multiply() methods
     * Overloading can only be used where the inputs are different
     * The new methods include a third variable (double c)
     * A third variable is added into the main method
     * Two extra print line statements added, to test the method and print the results  
     */
				
    public static void main(String[] args) {
		
	double a = 2;
	double b = 4;
	double c = 5; //new variable, used in the overloading method calls
		
	//add two new print line statements for the new overloaded method calls
	System.out.println(add(a,b));
	System.out.println(subtract(a,b));
	System.out.println(divide(a,b));
	System.out.println(multiply(a,b));
	System.out.println(add(a,b,c)); //overloaded, with new param
	System.out.println(multiply(a,b,c)); //overloaded, with a new param
	
    }

    //return statements for each method, with a return statement for the function calc
    public static double add(double a, double b) {
	return a + b;
    	}
		
    public static double subtract(double a, double b) {
	return a - b;
    	}
		
    public static double divide(double a, double b) {
	return a / b;
	}
		
    public static double multiply(double a, double b) {
	return a * b;
	}
    
    //overloaded method call. notice reused method name, but with different values & algorithm
    public static double add(double a, double b, double c) {
	return a + b + c;
	}

    //overloaded method call. notice reused method name, but with different values & algorithm
    public static double multiply(double a, double b, double c) {
	return a * b * c;
	}
			
}
