package toString;

public class TestPizzaShop 

{

    public static void main(String[] args) 
    
    {
	
/*
 * Create a new class called TestPizzaShop.java containing one main method
 * Write code in the main method to create a new instance of PizzaShop
 * create 3 new pizza orders, using the arrays of pizzas and customers created in PizzaShop 
 * Add a new method to PizzaShop called ‘orderStatus’
 * returns a String to user what orders currently exist
 * You should make calls to the toString method in Order class
 */
	
	// write code in the main method to create a new instance of PizzaShop
	
	PizzaShop pizzaShop = new PizzaShop();
	
	// create 3 new pizza orders, using the arrays of pizzas and customers that have been created in PizzaShop.java
	
	Customer [] customers = pizzaShop.getCustomers(); //gets all customers from pizzashop @ line 55
	Pizza [] allPizzas = pizzaShop.getPizzas(); //gets all pizza types from pizzashop @ line 55

	// create order 1
	
	Customer orderCustomer1 = customers[1]; //the customer at array index 1, NOT the first array item (which would be [0]
	Pizza [] pizzaOrder1 = new Pizza[2]; //this is the array length, not the pizza type, i.e. number of pizzas in the order
	pizzaOrder1[0] = allPizzas[1]; //first pizza in the Pizza array. allPizzas index value is the pizza type, from line 27
	pizzaOrder1[1] = allPizzas[2]; //second pizza in the array
	
	pizzaShop.addOrder(orderCustomer1, pizzaOrder1); //passed to addOrder method in pizzashop @ line 48
	
	//create 2 more orders
	
	// create order 2
	
	Customer orderCustomer2 = customers[0];
	Pizza [] pizzaOrder2 = new Pizza[3];
	pizzaOrder2[0] = allPizzas[1];
	pizzaOrder2[1] = allPizzas[0];
	pizzaOrder2[2] = allPizzas[2];
	
	pizzaShop.addOrder(orderCustomer2, pizzaOrder2);

	// create order 3	
	
	Customer orderCustomer3 = customers[2];
	Pizza [] pizzaOrder3 = new Pizza[2];
	pizzaOrder3[0] = allPizzas[1];
	pizzaOrder3[1] = allPizzas[1];
	
	pizzaShop.addOrder(orderCustomer3, pizzaOrder3);

	//Add a new method to PizzaShop called ‘orderStatus’
	//method should return a String which tells the user what orders currently exist
	//You should make calls to the toString method in Order class
	
	//Order 1
	
	System.out.println(pizzaShop.toString());
	
	//Order 2
	
	//Order 3
	
    }

}
