package toString;

public class TestOrder 

{
    public static void main(String[] args) 
    
    {
	
	/*
	 * Write a new class with one main method called ‘TestOrder.java’
	 * This class should create several orders with different values
	 * This will use the separate order object class
	 * Use the toString method to print out the state of the variables for each new order object
	 */
	
	Customer newCustomer = new Customer("Marc", "Barnsley");
	
	String[] pepperoni = {"pepperoni", "minced beef"};
	String[] diavalo = {"pepperoni", "minced beef", "chillies"};
	String[] chicken = {"chicken", "sweetcorn"};
	
	//main Pizza object constructor - must provide name, toppings and price. Will be passed to Pizza class, at line 26
	
	Pizza [] pizzaOrder = new Pizza[3];
	
	pizzaOrder[0] = new Pizza("Pepperoni", pepperoni, 6.95); //array value as line 24
	pizzaOrder[1] = new Pizza("Diavalo", diavalo, 7.95);
	pizzaOrder[2] = new Pizza("Chicken & Sweetcorn", chicken, 8.95);
	
	Order myOrder = new Order(newCustomer, pizzaOrder); 
	
	System.out.println(myOrder.toString());
	
    }
}