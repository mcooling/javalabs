package myPackage;

public class TestFood 
{

    public static void main(String[] args) 
    {
	//passes variables to Food class constructor @line 21
	Food newFood = new Food("generic food", new String[] {"content1", "content2"}, 7.95);
	System.out.println(newFood.toString());
    }

}
