package co.grandcircus;

import java.util.Scanner;

public class ValidationDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// checkForInt(scan);checForInt2(scan);
		checkForInt2(scan);

	}

	public static void checkForInt2(Scanner scan) {
		System.out.println("Please enter a whole number: ");
		while (!scan.hasNextInt()) {
			System.out.println("Try again, please enter a whole number!");
		}
		int userNum = scan.nextInt();
		System.out.println("You entered: " + userNum);

	}

	public static void checkForInt(Scanner scan) {
		if (scan.hasNext()) { // making sure the scanner has an int
			int userNum = scan.nextInt();
			System.out.println(userNum);
		} else {
			System.out.println("Your number is not valid");
		}
	}
}