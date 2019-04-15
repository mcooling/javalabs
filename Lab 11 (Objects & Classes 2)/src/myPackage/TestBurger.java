package myPackage;

public class TestBurger 
{

    public static void main(String[] args) 
    
    {
	
	Burger newBurger = new Burger("cheeseburger", new String [] {"cheese", "onions"}, 6.95);
	System.out.println(newBurger.toString()); //this is going to the toString method in Burger class
	System.out.println(newBurger.getName()); //this inherits the getName method from the Food superclass
		
    }

}
