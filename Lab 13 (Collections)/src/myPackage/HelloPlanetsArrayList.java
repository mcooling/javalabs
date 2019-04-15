package myPackage;

import java.util.ArrayList;
import java.util.List;

public class HelloPlanetsArrayList 
{

/*
 * In Lab 7, HelloPlanets stored names of planets as Strings, then printed a message for each planet
 * Change the code to use an Arraylist instead of an array, to store the names of the planets
 * Make sure the arraylist contains Strings, using generics
 * Print out the strings as before    
 */
    
    public static void main(String[] args) 
    {
	//DECLARE new array variable
	//String [] planetName = new String[8]; //could also write this as {"Mars", "Saturn", etc}
	
	
	//Declare a new string array list constructor
	List<String> planetArray = new ArrayList<String>();
	
	//add items to the array list
	planetArray.add("Mars");
	planetArray.add("Saturn");
	planetArray.add("Mercury");
	planetArray.add("Jupiter");
	planetArray.add("Earth");
	planetArray.add("Neptune");
	planetArray.add("Venus");
	planetArray.add("Uranus");
			
	//DECLARE array variable items	
	/*planetName[0] = "Mars"; //the variable item values have to match the variable type, e.g. String in this case
	planetName[1] = "Saturn";
	planetName[2] = "Mercury";
	planetName[3] = "Jupiter";
	planetName[4] = "Earth"; 
	planetName[5] = "Neptune";
	planetName[6] = "Venus";
	planetName[7] = "Uranus";*/
			
	//ADD FOR LOOP to print each array item
	for(int i = 0; i < planetArray.size(); i++) //arraylist uses .size() instead of .length
	{
	    System.out.println("Planet " + (i + 1) + " is " + planetArray.get(i)); //uses .get method call instead of [i]
	    //used i + 1 as i will take the index value, not the human literal number
	}
    }
}
