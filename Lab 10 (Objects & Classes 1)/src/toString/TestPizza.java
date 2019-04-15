package toString;

public class TestPizza 

/*
 * Write a new class, to interact with the pizza class
 * creates several pizzas with different values
 * Add toString method calls or each object, to call toString from pizza class and print contents as a string
 */

{
    public static void main(String[] args) 
    
    {
	//create several pizzas with different values
	
	//create an array for each set of pizza toppings. 
	//passed in each method call to Pizza (lines 31-33)
	
	String[] pepperoni = {"pepperoni", "minced beef"};
	String[] diavalo = {"pepperoni", "minced beef", "chillies"};
	String[] chicken = {"chicken", "sweetcorn"};
	
	//main Pizza object constructor.
	
	Pizza [] pizzaList = new Pizza[3]; //new object created as an array
	
	//creates 3 new pizza 'objects'. string, string array and double passed to pizza class
	
	pizzaList[0] = new Pizza("Pepperoni", pepperoni, 6.95); //array value as line 24
	pizzaList[1] = new Pizza("Diavalo", diavalo, 7.95);
	pizzaList[2] = new Pizza("Chicken & Sweetcorn", chicken, 8.95);
	
	//class modified with toString method calls. corresponds to toString method call in pizza class
	
	System.out.println(pizzaList[0].toString()); 
	System.out.println(pizzaList[1].toString());
	System.out.println(pizzaList[2].toString());
	System.out.println();
	
    }
	
}

