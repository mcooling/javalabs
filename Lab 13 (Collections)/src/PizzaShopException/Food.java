package PizzaShopException;

/*
 *Create a new class ‘Food’, which extracts the common fields from pizza and burger.
 *c. Edit Pizza and Burger to extend the Food class, removing any repeated methods. 
 *(N.b. make sure to include appropriate toString methods in each class)
 *d. Write 2 new test classes to ensure that your objects behave as expected (TestFood.java, TestBurger.java)
 *Rerun the tests from TestPizza.java and ensure the results have not changed.
 */

public class Food

//Create a new class ‘Food’, which extracts the common fields from pizza and burger.

{    
    
    private String name;
    private String [] toppings;
    private double price;
    
    public Food(String nameIn, String [] toppingsIn, double priceIn)
    {
	name = nameIn;
	toppings = toppingsIn;
	price = priceIn;
    }

    public String getFoodContents()
    {
	String tempString = "";
	for (int i = 0; i < toppings.length; i++)
	{
	    tempString = tempString + toppings[i];
	    
	    if (i < (toppings.length - 1))
	    {
		tempString = tempString + ", ";
	    }
	    
	}
	return tempString;   
	    
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    public String toString()
	{
	    return "The food name is " + getName() + ", the fillings are " + getFoodContents() + " and the price is £" + getPrice();
	}
}
