package myPackage;

//parent interface, operates in the same way as List/ArrayList
//any of these imports will work
import java.util.*; //wildcard, i.e. will import everything from java.util 
import java.util.Map; //works with any method from Map interface (inc. HashMap)
import java.util.HashMap; //will only work with HashMap

/*
 * Make a copy of PasswordChecker programme from lab 4
 * Instead of storing the password as a String, store uname-pword pairs in a HashMap
 * Consider what data type the uname & pword should be
 * You will need to specify these using Java Generics.
 * Inside the while loop, ask the user to enter a uname and pword
 * If uname and pword match those in the hashmap, the while loop should exit & print a message
 * If not, the while loop should continue, with a suitable message to the user
 * Hint: What happens if you provide a uname that doesn’t exist?
 * What about if you provide a uname, but an incorrect pword? 
 * Should you have different messages for each of these cases?
 */

public class PasswordCheckerHashMap {

    public static void main(String[] args) {

	/*
	 * Instead of storing the password as a String, store username-password pairs in a HashMap
	 * Consider what data type the username and password should be
	 * You will need to specify these using Java Generics.    
	 */
	    
	//
	Map<String, String> passwordMap = new HashMap<String, String>();
	//as with List/ArrayList, notice we have used Map at the left of the constructor
	
	passwordMap.put("marc", "marc74"); //.put() function 'puts' key-value pairs into HashMap
	//as with any other method, the format of the input has to match the type of HashMap
	//in this case we are using string
	
	//adds a new user input variable, to enter username
	//this is the key from the key-value pair in the HashMap
	System.out.println("What is your username");
	Scanner scanner = new Scanner(System.in);
	String unameIn = scanner.nextLine();
	
	//update password to check entered value against the key value stored
	System.out.println("What is your password");
	String pwordIn = scanner.nextLine();
	String pword = passwordMap.get(unameIn); //.get() gets the key value from HashMap
		
	while (!pwordIn.equals(pword)) //while the password is wrong
	{
	    //if the user name is also wrong
	    if (!passwordMap.containsKey(unameIn)) //.containsKey function used to check key in HashMap
		{
		    System.out.println("Username & password failed");
		    System.out.println("What is your username");
		    unameIn = scanner.nextLine();
		    System.out.println("What is your password");
		    pwordIn = scanner.nextLine();
		}
		    
	    else //if only the password is wrong
		{
		    System.out.println("Password failed");
		    System.out.println("What is your username");
		    unameIn = scanner.nextLine();
		    System.out.println("What is your password");
		    pwordIn = scanner.nextLine();
		}
	}
	
	//while the password is correct but the username is wrong
	while (!passwordMap.containsKey(unameIn)) 
	{
	    System.out.println("Username failed");
	    System.out.println("What is your username");
	    unameIn = scanner.nextLine();
	    System.out.println("What is your password");
	    pwordIn = scanner.nextLine();
	}
	
	//if both username and password are correct
	System.out.println("Logon accepted"); 
	scanner.close();
		
	}

}
