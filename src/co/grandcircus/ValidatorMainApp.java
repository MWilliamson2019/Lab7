package co.grandcircus;

import java.util.Scanner;

public class ValidatorMainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
			
				
	//String name = Validator.getString(scan, "Please enter your name: ");
	//System.out.println(name);
		
	//int userNum = Validator.getInt(scan, "Please enter a whole number: ");
	//System.out.println(userNum);
	
	
	//int userRange = Validator.getInt(scan,  "Please enter a whole number btwn 50 & 100: " ,50, 100);
	//System.out.println(userRange);
	
	//double userDouble = Validator.getDouble(scan,  "Please enter a double: ");
	//System.out.println(userDouble);
	
	

	double userDouble = Validator.getDouble(scan,  "Please enter a double between 9.25 and 87.665: ", 9.25, 87.665);
	System.out.println(userDouble);
		
	
	scan.close();
	

	}

}
