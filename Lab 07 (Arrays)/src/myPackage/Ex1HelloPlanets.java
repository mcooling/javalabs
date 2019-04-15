package myPackage;

public class Ex1HelloPlanets 
{
	
    public static void main(String[] args)

/*
 * Create an array of Strings, to store the names of each planet	
 * Use a for loop to cycle through the array and print each planet name
 */

//BEGIN
    //DECLARE new array variable
    //DECLARE array variable items
    //ADD FOR LOOP to print each array item
//END
	
    {
	//DECLARE new array variable, including array length
	String [] planetName = new String[8];
	
	//DECLARE array variable items	
	//the variable item values have to match the variable type, e.g. String in this case
	
	planetName[0] = "Mars"; 
	planetName[1] = "Saturn";
	planetName[2] = "Mercury";
	planetName[3] = "Jupiter";
	planetName[4] = "Earth"; 
	planetName[5] = "Neptune";
	planetName[6] = "Venus";
	planetName[7] = "Uranus";
	
	//ADD FOR LOOP to print each array item
	for(int i = 0; i < planetName.length; i++)
	    
	//planetName.length here, is the length of the array (8)
	//value of i here, is the array index value
	//as index begins at i = 0, it needs to end at i = 7
	//as planetName.length = 8, the loop test condition needs to be < 8
	//using i < 8 would also work
	    
	{
	    System.out.println("Planet " + (i + 1) + " is " + planetName[i]); 
	    //used i + 1 as i will take the index value, not the human literal number
	    //planetName[i] is the string value of the array item, i.e. the planet name
	}
	
    }

}
