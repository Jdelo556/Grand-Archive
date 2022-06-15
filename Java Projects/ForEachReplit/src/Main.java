import java.util.*;

public class Main {
	public static void main(String[] args) {

	    // This is the list of ints that you will need to use below.

	    List<Integer> intList = new ArrayList<>();

	    // Ignore the code below. It is used to get an input for the test.
	//-------------------------------------------------------
	    Scanner sc = new Scanner(System.in);

	    while(sc.hasNextInt()){
	      intList.add(sc.nextInt());
	    }

	    sc.close();
	//--------------------------------------------------------
	   
	    // This makes max equal to the first value in the intList.
	    int max = intList.get(0);

	    // Start here
	    for (Integer i : intList) {
	    	
	    }
	    // 1. Go through the intList (line 8) and find the largest number in it. Use the int max (line 22) above to store the largest number. Use a for each loop.
	    // 2. Print this number out.
	    System.out.print(intList + " ");

	    // If you want to run the code yourself keep type a number to add to this list and press enter. Keep doing this till you want to stop. Then type done and then hit enter.
	    
	  }
	

}
