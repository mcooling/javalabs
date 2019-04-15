package PizzaShopException;

/* Your pizza shop has decided to take its business online
 * To accommodate this, create a new class called InternetCustomer
 * This class should extend Customer and add the field: private String emailAddress;
 * The constructor of InternetCustomer should take the same arguments as Customer, plus an extra argument for email address. 
 * You should pass the arguments relevant to customer to the superclass by making a call to the constructor in Customer using the keyword ‘super’ (as shown in the lecture) 
 */

//create a new class called InternetCustomer
public class InternetCustomer extends Customer
{

    //add the field: private String emailAddress;    
    
    private String emailAddress;
    
    //The constructor of InternetCustomer should take the same arguments as Customer
    //plus an extra argument for email address. 
    
    //pass the arguments relevant to customer to the superclass
    //make a call to the constructor in Customer using the keyword ‘super’ (as per lecture)
    
    public InternetCustomer(String reqName, String reqAddress, String reqEmail)
    {
	super(reqName, reqAddress);
	emailAddress = reqEmail;
    }
    
    //write a toString method for InternetCustomer
    //method should call the toString method in Customer, using 'super' keyword (as lecture)
    
    public String toString()
    {
	String output = super.toString() + " email address: " + emailAddress; //need to add the new emailAddress variable, as the super.toString method is only returning the name and address from superclass
	return output;
    }

    //Edit the list of customers created in the constructor of PizzaShop, to include 3 new InternetCustomers 
    //(Remember you can refer to a subclass by the superclass type)
    //Add these to the array of customers created in the constructor of PizzaShop

}
