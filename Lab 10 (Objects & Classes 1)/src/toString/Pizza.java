package toString;
//import java.util.Arrays;

/*
 * class to represent a pizza object 
 */

public class Pizza
{
  
  //note the variables are private. they are only available within this class
  //separate public 'getter' methods are used (see below), to access these variables 
    
  //variable for the name of the pizza
  private String name;
  
  private String tempString = "";
  
  //string array, to hold the pizza toppings
  private String [] toppings;
  
  //variable for the price of the pizza
  private double price;
  
  //main constructor. requires a string, string array and double for the price
  //values passed in from the test pizza class
  
  public Pizza(String reqName, String [] reqToppings, double reqPrice)
  {
    //values passed into the constructor are assigned to the private variables
      
    name = reqName;
    toppings = reqToppings;
    price = reqPrice;
  }

  //create a set of three 'getter' methods
  //used to 'get' the private variables and return to test class
  //note these are public. this allows the other classes (including test pizza) to access them
 
  //get the name of the pizza
  public String getName()
  {
    return name;
  }

  //get the toppings required for this pizza
  public String getToppings()
  
  {
    //build a loop here to output the content of the string passed from constructor method
    for (int i = 0; i < toppings.length; i++) //counter for each array object, i.e. pizzaList [0],[1],[2]
    {
	  tempString = tempString + toppings[i]; //creates a string value for each array object
	  
	  if (i < (toppings.length - 1)) //if with a loop, to add a comma to the first two array objects
	  {
	      tempString = tempString + ", ";
	  }
    }
    
    return tempString; //returns the string value separately (for each array object)
    
  }

  //get the price of this pizza
  public double getPrice()
  {
    return price;
  }
  
  //class updated with toString() method call. corresponds to toString 
  public String toString()
  {
    return "The pizza name is " + getName() + ", the toppings are " + getToppings() + " and the price is £" + getPrice();
  }
  
}