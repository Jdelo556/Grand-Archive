import java.util.InputMismatchException;
import java.util.Scanner; 

public class ATMmain {
 
 
 public static void main(String[] args) {
	 
	 Scanner input = new Scanner(System.in); 
		 double amount = 0;
 
 System.out.println("Your balance is: " + amount + " Please input " + "Your deposit or withdrawl amount");
 
 System.out.println("(Negative values will count as a withdrawl)");
 
 System.out.println("Please type \"done\" when you have finished your business. " + " Note you cannot have a negative balance. ");
 
 while (!input.equals("Done") || !input.equals("Done")){
	 try {
		 double transaction = input.nextDouble(); 
	 
 
	 
	 
	 if(amount + transaction <= 0) {
		 System.out.println("Being poor is a crime in America, you know that right?");
		 
	 }else {
		 
		 amount += transaction;
		 
		 System.out.println("That's what I thought. " + "Anyways..." + "Your balance is: " + amount + " Please input " + "Your deposit or withdrawl amount");
		 
		 System.out.println("(Negative values will count as a withdrawl)");
		 
		 System.out.println("Please type \"done\" when you have finished your business. " + " Note you cannot have a negative balance. ");
		 }		 
		 	 
	 }catch(InputMismatchException e) {
 	
	 if (input.nextLine().equalsIgnoreCase("done")) {
 		System.out.println("Thank you for banking at "  + "Delorenzo banking institution!");
 		
 		break;
 		
 		
 	}else {
 		System.out.println("Your balance is: " + amount + "\n Please input " + "Your deposit or withdrawl amount");
 		 
 		 System.out.println("(Negative values will count as a withdrawl)");
 		 
 		 System.out.println("Please type \"done\" when you have finished your business. " + "\n Note you cannot have a negative balance. ");
 		 
 		 double transaction = input.nextDouble();
 		
 	if(amount + transaction <= 0) {
 		System.out.println("Being poor is a crime in America, you know that right?");
 	
 			 
 	}else {
 			amount += transaction;
 			 
 			 System.out.println("Your balance is: " + amount + "\n Please input " + "Your deposit or withdrawl amount");
 			 
 			 System.out.println("(Negative values will count as a withdrawl)");
 			 
 			 System.out.println("Please type \"done\" when you have finished your business. " + "\n Note you cannot have a negative balance. ");
 		 }
 	}
	 }
 }
 }
}
 
 

