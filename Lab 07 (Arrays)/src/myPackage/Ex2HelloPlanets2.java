package myPackage;

public class Ex2HelloPlanets2 
{
    public static void main(String[] args)

 /*
 * Extends HelloPlanets programme slightly
 * Replaces the for loop with the for each loop
 * For each is a shorthand way of saying 'for each item, do x'
 * Only problem is it doesn't access the array index value, to print the planet number
 */

//BEGIN
   //DECLARE new array variable
   //DECLARE array variable items
   //ADD FOR LOOP to print each array item
//END
	
    {
	//DECLARE new array variable
	String [] planetName = new String[8];
		
	//DECLARE array variable items	
	planetName[0] = "Mars"; 
	planetName[1] = "Saturn";
	planetName[2] = "Mercury";
	planetName[3] = "Jupiter";
	planetName[4] = "Earth"; 
	planetName[5] = "Neptune";
	planetName[6] = "Venus";
	planetName[7] = "Uranus";
	
	//ADD FOREACH LOOP 
	//i.e. for each item in the planetName array, do something
	for(String planet : planetName)
	{
	    System.out.println("Planet " + planet);
	}
		
    }

}
