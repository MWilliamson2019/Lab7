package co.grandcircus;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
				
	    System.out.println("Please enter a whole number.");
	    
	    try {
	    	// anything that you think could go wrong
	    	// should go in the try block
	    	
	  
	    int userNum = scan.nextInt();
	    
	    } catch (InputMismatchException e) {
	    	//this block of code only runs if an input mismatch 
	    	 // exception occurs
	    	System.out.println("Hey you must enter a whole number!");
	    }
	} 

}
