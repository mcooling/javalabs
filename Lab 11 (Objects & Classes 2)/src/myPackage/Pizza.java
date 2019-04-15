package myPackage;
//import java.util.Arrays;

/*
 * class to represent a pizza object. 
 */

public class Pizza extends Food
{
  
/*  //the name of the pizza
  private String name;
  
  private String tempString = "";
  
  //the toppings required by this pizza
  private String [] toppings;
  
  //the price for this pizza
  private double price;
  
  //main constructor - must supply name, toppings and price
*/  
  public Pizza(String reqName, String [] reqToppings, double reqPrice)
  {
    //no longer need these variables, as we are now only calling the super class at line 31
      
    //name = reqName;
    //toppings = reqToppings;
    //price = reqPrice;
      super(reqName, reqToppings, reqPrice);
  }

  //set of getter methods, which return the variables set above
  //get the name of the pizza
  
  
  //we no longer need the getters, as we are using the superclass at line 71
  
  /*public String getName()
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
  }*/
  
  public String toString()
  {
    return "The pizza name is " + super.getName() + ", the toppings are " + super.getFoodContents() + " and the price is £" + super.getPrice();
  }
  
}