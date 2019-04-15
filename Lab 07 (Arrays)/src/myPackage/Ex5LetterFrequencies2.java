package myPackage;

public class Ex5LetterFrequencies2 

{
	public static void main(String[] args) 
	
	//just a clean version, without all the comments
	
	{
		int[] intArray = new int[26];
		intArray = letterFrequencies("fox");
		for(int i = 0; i < 26; i++)
		{
			System.out.print(intArray[i]);
		}
	}
	
	public static int [] letterFrequencies(String input)
	{
		int[] intArray = new int[26]; 
		char[] alphabetArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int i = 0; i < alphabetArray.length; i++)
		{
			intArray[i] = timesCharOccurs(alphabetArray[i], input);
		}
		return intArray;
	}
	
	public static int timesCharOccurs(char searchCharacter, String input) 
	{
	char [] stringArray = input.toCharArray();
	int counter = 0; 
		
	for (int i = 0; i < stringArray.length; i++) 
		{
			if(stringArray[i] == searchCharacter || stringArray[i] == Character.toUpperCase(searchCharacter)) 
				{
					counter ++;
					System.out.println(counter);
				}
		}
	return counter; 
	}
}


