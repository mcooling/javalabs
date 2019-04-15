package myPackage;
//import java.util.Arrays;

public class TestPizza 

/*
 * Write a new class with one main method called ‘TestPizza.java’
 * This class should create several pizzas with different values
 * This will use the separate Pizza object class
 * Use the toString method to print out the state of the variables for each new pizza object
d. Repeat (b) and (c) for Customer.java and Order.java. You should write separate testing classes: TestCustomer.java and TestOrder.java
 */

{
    public static void main(String[] args) 
    
    {
	//create several pizzas with different values
	
	//create an array for each set of pizza toppings. This will be passed in each method call to Pizza @ lines 32, 33, 34
	
	String[] pepperoni = {"pepperoni", "minced beef"};
	String[] diavalo = {"pepperoni", "minced beef", "chillies"};
	String[] chicken = {"chicken", "sweetcorn"};
	
	//main Pizza object constructor - must provide name, toppings and price. Will be passed to Pizza class, at line 26
	
	Pizza [] pizzaList = new Pizza[3];
	
	pizzaList[0] = new Pizza("Pepperoni", pepperoni, 6.95); //array value as line 24
	pizzaList[1] = new Pizza("Diavalo", diavalo, 7.95);
	pizzaList[2] = new Pizza("Chicken & Sweetcorn", chicken, 8.95);
	
	//the toppings section of the toString return isn't printing
	//guessing it's only accessing the id of the array object name, not the contents of the array
	
	System.out.println(pizzaList[0].toString()); 
	System.out.println(pizzaList[1].toString());
	System.out.println(pizzaList[2].toString());
	System.out.println();
	
	//code below technically works, but only within this class and only for the contents of the array
	//System.out.println(Arrays.toString(pepperoni));
	
    }
	
}

