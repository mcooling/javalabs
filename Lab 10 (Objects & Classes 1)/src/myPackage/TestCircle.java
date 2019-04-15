package myPackage;
import java.util.Scanner;
public class TestCircle 

{

    public static void main(String[] args) 
    
    /* write a new class TestCircle
     * create two new circle objects with different radius'
     * call the Circle class to do the calcs for area and perimeter
     * print their perimeters and areas, using the return value from circle class
     */
    
    {
	Scanner keyboard = new Scanner(System.in);
	
	//create variables for the radius' entered by the user
	double circleRadius;
	double circleRadiusTwo;

	System.out.print("Please enter the radius of your first circle: ");
	circleRadius = keyboard.nextDouble();
	System.out.print("Please enter the radius of your next circle: ");
	circleRadiusTwo = keyboard.nextDouble();
	
	//create a new Circle object for each circle
	//constructor format corresponds to the constructor in Circle class
	Ex1Circle myCircle = new Ex1Circle(circleRadius); //passes radius parameter to Circle object in Circle class
	Ex1Circle myCircleTwo = new Ex1Circle(circleRadiusTwo);
	
	//use the different Circle Class methods, to display area, perimeter & radius
	System.out.println();
	System.out.println("The radius of the first circle is " + circleRadius);
	System.out.println("The area of the first circle is " + myCircle.calculateArea());
	System.out.println("The perimeter of the first circle is " + myCircle.calculatePerimeter());
	
	System.out.println();
	System.out.println("The radius of the first circle is " + circleRadiusTwo);
	System.out.println("The area of the first circle is " + myCircleTwo.calculateArea());
	System.out.println("The perimeter of the first circle is " + myCircleTwo.calculatePerimeter());
	keyboard.close();
    }

}
