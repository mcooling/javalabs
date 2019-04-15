package myPackage;

public class Ex4LetterFrequencies 

/*
 * add a new method to text processing program
 * 	public int[] letterFrequencies (String input)
 * 
 * should return an array of integers from 0 to 25, where 0 = a, 25 = z
 * method must return values to main method
 * method tested by printing in the main method, not the method called
 * returned value for each index is the number of times each letter of the alphabet appears in the string
 * e.g. index 0 (a) value = 1, as 'a' appears 1 time in the input string
 * index index 6 (g) value = 2, as 'g' appears 2 times in the input string
 * 
 * reuse the timesCharOccurs method from ex 2
 * make a call for every letter of alphabet
 * consider how to use arrays and loops to make the code more efficient
 */

//PSEUDOCODE
//The pseudocode for the timesCharOccurs method is as follows:

//Three methods
//MAIN method takes the value from LF method, with a loop counter to print each value
//LETTER FREQUENCY method derives the value from TCO method and passes back to main method
//TIMES CHARACTER OCCURS checks if each letter in the string matches each letter of the alphabet and passes value to LF method

{
    public static void main(String[] args) 
    {
	//CREATE NEW method call in main method
	int[] intArray = new int[26]; //new array, to hold 26 index values
	//method call @line 42 return value 'intArray' @ line 53
	//then a further nested method call from letterFrequencies to timesCharOccurs
	//then gets passed to timesCharOccurs @line 59
	intArray = letterFrequencies("foxo");
	for(int i = 0; i < intArray.length; i++) //for loop counter
	    {
	    	System.out.print(intArray[i]); 
	    	//prints 'intArray' value returned from letterFreq, for each index value
	    }
    }
    	//CREATE NEW method 
	
    public static int [] letterFrequencies(String input)//takes string "fox" from main method @ line 34
    {
	int[] intArray = new int[26]; //stores output from intArray for loop
	//CREATE new array, holding each letter in the alphabet
	char[] alphabetArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 
	for(int i = 0; i < alphabetArray.length; i++) //loops through the alphabet array above
	    {
		intArray[i] = timesCharOccurs(alphabetArray[i], input); 
		//calls timesCharOccurs @line 57, passing letter of alphabet and the string "foxo"
	    }

	return intArray; //passes value back to main method @line 34
    
    }
	
    public static int timesCharOccurs(char searchCharacter, String input) 
	//takes values 'alphabetArray[i]' and the given string from letterFrequencies @ line 49
    {
	char [] stringArray = input.toCharArray(); //transform string "foxo" into an array with 4 index values
	int counter = 0; //counter for how many times the 'alphabetArray' char matches each array index value
	for (int i = 0; i < stringArray.length; i++) //create loop counter for each array index
	    { 
		if(stringArray[i] == searchCharacter || stringArray[i] == Character.toUpperCase(searchCharacter)) 
		    //modified if statement to recognise both upper and lowercase
		{
		    counter ++; //increase counter by 1 if there's a match
		}

	    }
	
	return counter; //RETURN counter to letterFrequencies method @line 49
	
    }
    
}


