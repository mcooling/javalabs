package PizzaShopException;

public class TestFood 
{

    public static void main(String[] args) 
    {
	Food newFood = new Food("generic food", new String[] {"content1", "content2"}, 7.95);
	System.out.println(newFood.toString());
    }

}
