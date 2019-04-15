package myPackage;

public class Burger extends Food //c. Edit Pizza and Burger to extend the Food class
{
    /*
     * In addition to going online, the pizza shop has decided to branch out into the burger business
     * Create a new Burger class, which contains fields for name, price and burger filling (e.g., beef, chicken, ...)
     * b. Note that Pizza and Burger contain similar fields. 
     * Create a new class ‘Food’, which extracts the common fields from pizza and burger.
     * c. Edit Pizza and Burger to extend the Food class, removing any repeated methods. 
     * (N.b. make sure to include appropriate toString methods in each class)
     * d. Write 2 new test classes to ensure that your objects behave as expected (TestFood.java, TestBurger.java)
     * Rerun the tests from TestPizza.java and ensure the results have not changed.
     */
    
    // Create a new Burger class, which contains fields for name, price and burger filling (e.g., beef, chicken, ...)
    // b. Note that Pizza and Burger contain similar fields. 
    
    //* c. Edit Pizza and Burger to extend the Food class, removing any repeated methods. 
    
    //we no longer need these variables, as we are calling superclass
    /*private String burgerName;
    private String [] burgerFillings;
    private double burgerPrice;*/
    
    public Burger(String reqName, String [] reqFillings, double reqPrice)
    {
	
    //we no longer need these variables, as we are calling superclass at line 36

      /*burgerName = reqName;
      burgerFillings = reqFillings;
      burgerPrice = reqPrice;*/
	
      super(reqName, reqFillings, reqPrice);
	
    }

    //we no longer need these getters, as we are calling superclass at line 54
    
    /*public String getBurgerName() {
        return burgerName;
    }

    public String[] getBurgerFillings() {
        return burgerFillings;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }*/
    
    public String toString() 
    //this now replaces the previous getters, as we are now calling the generic getters from Food class
    {
	return "The burger name is " + super.getName() + ", the fillings are " + super.getFoodContents() + " and the price is £" + super.getPrice();
    }

}
