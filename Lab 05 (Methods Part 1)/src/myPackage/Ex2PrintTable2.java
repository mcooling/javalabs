package myPackage;

public class Ex2PrintTable2 {

    public static void main(String[] args) {

	/*
	 * Extends the previous exercise, to further simply the main method
	 * Previously just used simple method calls
	 * This introduces passing data into a method call
	 * Replaces the inline print line statements with a new single method call
	 * Content of each print line passed inside the () method call
	 * Separate method call takes data as input and prints out
	 * Same output
	 */
	
	myDash();
	mySeparator();
	//new method call, passes content to be printed
	//data type has to be declared, e.g. in this case, each string value is passed as "string"
	data(" a "," b "," c "," d "," e "); 
	mySeparator();
	myDash();
	myDash();
	mySeparator();
	data(" 1 "," 2 "," 3 "," 4 "," 5 ");
	mySeparator();
	myDash();
	myDash();
	mySeparator();
	data(" i "," ii","iii"," iv"," v ");
	mySeparator();
	myDash();
	myDash();
	mySeparator();
	data(" r "," o "," y "," g "," b ");
	mySeparator();
	myDash();
	myDash();
	mySeparator();
	data("jan","feb","mar","apr","may");
	mySeparator();
	myDash();
	myDash();
	mySeparator();
	data("gen","exo","lev","num","deo");
	mySeparator();
	myDash();
		
	}
	
	public static void myDash() {
	//method will print the lines of dashes
	    System.out.println("---------------------");
	}
	
	public static void mySeparator() {
	//method will print the lines of separators
	    System.out.println("|   |   |   |   |   |");	
	}
	
	//new method. takes the inputs passed from each method call in main method
	//data type within the method, has to match the data type of the data passed
	
	public static void data(String info1, String info2, String info3, String info4, String info5) {
	    //method prints the output, using combination of string and value
	    //note the values used in the println are the same as those used in the method, i.e. info1, info2 etc
	    System.out.println("|" + info1 + "|" + info2 + "|" + info3 + "|" + info4 + "|" + info5 + "|");	
	}
}
