package myPackage;

import java.util.Scanner;

public class Ex4_ListOfLists {

    public static void main(String[] args) {
	
	/*
	 * Create a menu of options for animal, fruit and celebrities
	 * User to select an option
	 * Create a further sub menu for each option
	 * Again, user asked to select an option from the sub menu
	 * Print output from select sub menu option, for types of that option
	 * Uses nested switch statement to create the main menu and sub menu options
	 * Uses the .charAt(0) library method, to store the character entered
	 * charAt value set to (0) as 0 is the first character in the index
	 */
		
	System.out.println("Hello! Please choose an option");
	System.out.println("a. Animals");
	System.out.println("b. Fruit & Veg");
	System.out.println("c. Celebrities");

	Scanner scanner = new Scanner(System.in);
	char myOption = scanner.nextLine().charAt(0);
	
	//Master switch statement, for main menu. Three options (case a, b, c)
	switch (myOption) 
	{
		case 'a': System.out.println("You chose animals");
			
		System.out.println("Please choose an option");
		System.out.println("d. Mammal");
		System.out.println("e. Fish");
		System.out.println("f. Bird");
		char myAnimal = scanner.nextLine().charAt(0);
			
			//further 3 switch statements for each sub menu option (myAnimal), (myFruitVeg), (myCelebrity)
			switch (myAnimal) 
			{
			case 'd': 
			    System.out.println("You chose mammal");
			    System.out.println("Bear, dog and whale are all types of mammal"); break;
				
			case 'e': 
			    System.out.println("You chose fish");
			    System.out.println("Pike, trout and perch are all types of fish"); break;
				
			case 'f': 
			    System.out.println("You chose bird");
			    System.out.println("Parrot, owl and pigeon are all types of bird"); break;
				
			default: 
			    System.out.println("Nothing was selected"); 
			}
			
			break;
			
		case 'b': System.out.println("You chose fruit & veg");
				
		System.out.println("Please choose an option");
		System.out.println("d. Citrus fruit");
		System.out.println("e. Root veg");
		System.out.println("f. Beans");
		char myfruitVeg = scanner.nextLine().charAt(0);
					
			switch (myfruitVeg) 
			{
			case 'd': 
			    System.out.println("You chose citrus fruit");
			    System.out.println("Orange, lemon and lime are all types of citrus fruit"); break;
						
			case 'e': 
			    System.out.println("You chose root veg");
			    System.out.println("Potato, parsnip and turnip are all types of root veg"); break;
			
			case 'f': 
			    System.out.println("You chose beans");
			    System.out.println("Haricot, lentils and kidney are all types of bean"); break;
						
			default: 
			    System.out.println("Nothing was selected");
			}
			
			break;
					
		case 'c': System.out.println("You chose celebrities");
			
		System.out.println("Please choose an option");
		System.out.println("d. Footballers");
		System.out.println("e. Actors");
		System.out.println("f. Singers");
		char myCelebrity = scanner.nextLine().charAt(0);
				
			switch (myCelebrity) 
			{
			case 'd': 
			    System.out.println("You chose footballers");
			    System.out.println("Pele, Maradona and Kieffer Moore are all footballers"); break;
						
			case 'e': 
			    System.out.println("You chose actors");
			    System.out.println("Al Pacino, Cillian Murphy and Emma Stone are all actors"); break;
						
			case 'f': 
			    System.out.println("You chose singers");
			    System.out.println("Prince, John Lennon and Kate Bush are all singers"); break;
			
			default: 
			    System.out.println("Nothing was selected");
			} 
			break;
		}
		scanner.close();
	}

}
