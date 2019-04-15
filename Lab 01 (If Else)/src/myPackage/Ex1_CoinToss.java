package myPackage;
public class Ex1_CoinToss {

	public static void main(String[] args) {

			//adding comment to test github integration

	    	//use Math.random() library method, to generate a random number
	    	//assign to an int variable
	    	//use if-else statement to print "heads" or "tails"
	    
		int randomNumber = (int) (Math.random() * 101);
		System.out.println(randomNumber);
				
		if(randomNumber <= 30) 
		{
			System.out.println("Heads");
		}
		else
		{
			System.out.println("Tails");
		}

	}

}
