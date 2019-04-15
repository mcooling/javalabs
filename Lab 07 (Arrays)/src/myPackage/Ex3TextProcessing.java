package myPackage;

public class Ex3TextProcessing

//CREATE NEW method call
//CREATE NEW method
	//create a string variable
	//transform the string into an array
	//create a counter variable to 'count' the number of times a letter appears
	//create a loop counter, to loop through each character in the array
	//check if the character in the array is the one we’re searching for (passed in as a parameter)
	//if so, increase the counter by 1
//RETURN counter to main method
//TEST method call by printing counter result

{
    public static void main(String[] args) 
    
    {
	//CREATE NEW method call
	timesCharOccurs();
	//TEST method call by printing counter result
	System.out.print(timesCharOccurs());
	
    }
		
    	//CREATE NEW method 

    public static int timesCharOccurs()
    {
	//create a string variable
	String str = "i InsIst on icy indoor IglOos";
	
	//transform the string into an array
	char [] stringArray = str.toCharArray(); //uses the .toCharArray() library method
	//effectively creates an array with an index of 29, i.e. stringArray[0] = 'i'..stringArray[29] = 's'
	int counter = 0; //create counter to store number of times character appears
		
	for (int i = 0; i < stringArray.length; i++) //create loop counter for each letter in the string
	//stringArray.length used as the test condition. this means it would work for any string
	    
	    { 
	    	//if statement to check if the value of the array index is the same as the one being checked
	    	//uses 'equals' 'or' operators and Character.toUpperCase() method to include upper case
	    	if(stringArray[i] == 'o' || stringArray[i] == Character.toUpperCase('o')) 
	    	{
	    	    //if so, increase the counter by 1
	    	    counter ++;
		}
		
	    }
	
	return counter; //RETURN final counter value to main method, once for loop completes
    
    }
    
}


