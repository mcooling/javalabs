package myPackage;

/*
 * A class to represent an order placed by a customer at a pizza shop
 * the class will calculate the total cost of the order based on the pizzas 
 * that have been requested 
 */

public class Order
{
  // the customer placing the order
  private Customer customer;
  
  private String tempString = "";

  // the pizzas that have been ordered
  private Pizza[] pizzas;

  // the total price for all the pizzas
  private double totalPrice;

  //the main constructor for an order. Only requires customer and a list of pizzas, as total price will be calculated
  
  public Order(Customer reqCustomer, Pizza[] reqPizzas)
  {
    customer = reqCustomer;
    pizzas = reqPizzas;
    
    //calculate total price based on price of each pizza
    totalPrice = 0.0;
    for (Pizza pizza : pizzas)
      totalPrice += pizza.getPrice();
  }

//get the object referring to the customer
  public Customer getCustomer()
  {
    return customer;
  }

//get the pizzas that have been ordered

//build a loop here to output the content of the string passed from constructor method 

  public String getPizzas()
  
  {
  
      for (int i = 0; i < pizzas.length; i++) //counter for each array object, i.e. pizzaList [0],[1],[2]
  	{
	  tempString = tempString + pizzas[i].getName(); //creates a string value for each array object. 
	  //pizzas[i[].getName() calls the getName method from Pizza class @ line 33 
	  
	  if (i < (pizzas.length - 1)) //if with a loop, to add a comma to the first two array objects
	  {
	      tempString = tempString + ", ";
	  }
  	}
  
   return tempString; //returns the string value separately (for each array object) 
  
   }
  
  //get the total price of this order
  public double getTotalPrice()
  {
    return totalPrice;
  }
  
  public String toString()
  {
    return "The order is " + getCustomer() + " the pizzas required are " + getPizzas() + " and the total price of the order is " + getTotalPrice();
  }
  
}
