import java.util.Scanner;
 class Main {

	  public static void main(String[] args) {
	//-------------------------------------------------------
	    // Ignore scanner
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Type two words below this sentence!");
	    // You will use these two strings.
	    String mystery = sc.next();
	    String mystery2 = sc.next();
	    
	    // Ignore
	    sc.close();
	//--------------------------------------------------------
	    // 1. Print the length of String mystery
      System.out.println(mystery.length());

	    // 2. Print the character at the 5th position in the String mystery.
	    char ch = mystery.charAt(4);
      
	    System.out.println(ch);
	   

	    // 3. Combine mystery and mystery2 using the built in string method and print the resulting string.
    String full = mystery + mystery2;
    
    System.out.println(full);
      
	    
	  }
	}