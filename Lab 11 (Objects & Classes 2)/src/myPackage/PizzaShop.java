package myPackage;

/*
 * A class to model a pizza shop - has a database of pizzas, customers and 
 * can recieve orders
 */

public class PizzaShop
{
  //the pizza database - all pizzas that can be ordered
  private Pizza[] pizzas; //array instantiated @ @line 30
  
  //the customer database - all customers that are known to the system
  private Customer[] customers; //array instantiated @line 38
  
  //the orders that have been placed so far
  private Order[] orders; //array instantiated at @line 41

  //a variable to track what the next order number will be
  private int orderNumber; //initial value 0 assigned @line 44
  
  private String tempString = "";

  public PizzaShop()
  {
    // load Pizzas (we could load these from a database using file io)
    Pizza pizza1 = new Pizza("margherita", new String[] { "cheese", "tomato" }, 5.00);
    Pizza pizza2 = new Pizza("hawaiian", new String[] { "cheese", "tomato", "ham", "pineapple" }, 6.50);
    Pizza pizza3 = new Pizza("funghi", new String[] { "cheese", "tomato", "mushroom" }, 6.00);

    //create a new array from the pizza objects we have just created
    pizzas = new Pizza[] { pizza1, pizza2, pizza3 }; //passed into getPizzas() method call at line 61
    
    //Edit the list of customers created in the constructor of PizzaShop, to include 3 new InternetCustomers 
    //you can refer to a subclass by the superclass type

    // load Customers (we could load these from a database using file io)
    Customer customer1 = new Customer("Joe Bloggs", "12 Mayfair");
    Customer customer2 = new Customer("Fred Smith", "34 Oxford Road");
    Customer customer3 = new Customer("John Doe", "1 Bond Street");
    Customer customer4 = new InternetCustomer("Marc Cooling", "10 High Street", "marc@email.com"); 
    //new Customer object from InternetCustomer class

    //create a new array from the customers we have just created
    //add the internet customer to the array of customers created in the constructor of PizzaShop
    customers = new Customer[] { customer1, customer2, customer3, customer4 }; 
    //passed into getCustomers() method call at line 55

    // create an empty array for orders - will populate later (is 20 enough?)
    orders = new Order[20]; 

    // orderNumber starts at 0;
    orderNumber = 0;
  }

  //add an order to the list of orders (n.b. notice the array size @line 41. will fail at 21 orders)
  public void addOrder(Customer customer, Pizza[] pizzas) //passed by TPS at line 35
  {    
    orders[orderNumber] = new Order(customer, pizzas); //updates orders array at line 41 
    orderNumber++; //updates orderNumber at line 44
  }

  //get the database of customers
  public Customer[] getCustomers() //takes the customers array from line 38 and called by TPS @ line 26
  {
    return customers; //returned to TPS @ line 26
  }

  //get the database of pizzas
  public Pizza[] getPizzas() //takes the pizzas array from line 30 and called by TPS @ line 27
  {
    return pizzas; //returned to TPS @ line 27
  }
  
  /* d. Add a new method to PizzaShop called ‘orderStatus’ – this method should return a String which
   * tells the user what orders currently exist. You should make calls to the toString method in Order.java
   * */
  
  
  public String orderStatus()
  
  {
  
      for (int i = 0; i < orderNumber; i++) //counter for each object in the orders Order array, i.e. [0],[1],[2]. Uses orderNumber as this is the variable which is updated with each order
  	{
	  tempString = tempString + orders[i]; //creates a string value for each array object. 
	  
	  if (i < (orderNumber)) //if with a loop, to add a full stop after each order
	  {
	    tempString = tempString + ". ";
	  }
  	}
  
   return tempString; //returns the string value separately (for each array object) 
  
  }
  
  public String toString()
  {
    return orderStatus();
  } 
  
}
