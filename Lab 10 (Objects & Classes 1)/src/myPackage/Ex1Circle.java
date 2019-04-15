package myPackage;
public class Ex1Circle {
    
/*
 * write a class to represent a circle. you only require one variable, for the radius
 * the class should have a constructor which takes one variable (the required radius)
 * add a method to calculate the perimeter of the circle (formula perimeter = 2Pir, from math.pi)
 * add a method to calculate the area of the circle (formula pi r squared, from math.pi)
 * 
 * next exercise will write a new class, to test this class
 */  
    
    //create a variable for the circle radius
    private double radius;

    //write a class constructor which takes radius variable as an input
    public Ex1Circle(double radiusIn)
    {
      radius = radiusIn;
    }

    //add a method to calculate the perimeter
    //formula for perimeter is 2Pir. use Math.Pi function from math.pi
    public double calculatePerimeter()
    {
      return 2 * Math.PI * radius;
    }

    //add a method to calculate the area
    public double calculateArea()
    {
      return (Math.PI * radius) * (Math.PI * radius);
    }
    
    /*
     * public String toString() { return "Circle with radius" + radius +
     * "has area: " + area + "and perimeter: " + perimeter; }
     */
}
