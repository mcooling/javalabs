package myPackage;

public class Ex3PrintTable3 {

    public static void main(String[] args) {

	/*
	 * extends print table further
	 * this time, only the data() method is called
	 * the separators are then wrapped into the method
	 * printline algorithm within the data() method remains the same
	 */
	
	data(" a "," b "," c "," d "," e ");
	data(" 1 "," 2 "," 3 "," 4 "," 5 ");
	data(" i "," ii","iii"," iv"," v ");
	data(" r "," o "," y "," g "," b ");
	data("jan","feb","mar","apr","may");
	data("gen","exo","lev","num","deo");
		
	}
	
    public static void data(String info1, String info2, String info3, String info4, String info5) {
	
	System.out.println("---------------------");
	System.out.println("|   |   |   |   |   |");
	System.out.println("|" + info1 + "|" + info2 + "|" + info3 + "|" + info4 + "|" + info5 + "|");
	System.out.println("|   |   |   |   |   |");
	System.out.println("---------------------");
	
    }
}
