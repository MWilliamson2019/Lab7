package co.grandcircus;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

import java.util.Scanner;

public class Lab7 {

	// Regular expression and pattern matching for name

	private static Pattern usrNamePtrn = Pattern.compile("^[A-Z][a-z]{1,30}$");

	public static boolean validateUserName(String userName) {

		Matcher mtch = usrNamePtrn.matcher(userName);

		if (mtch.matches()) {

			return true;

		}

		return false;

	}

	// Regular expression and patter matching for email

	private static Pattern emailNamePtrn = Pattern.compile(

			"^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

	public static boolean validateEmailAddress(String userName) {

		Matcher mtch = emailNamePtrn.matcher(userName);

		if (mtch.matches()) {

			return true;

		}

		return false;

	}

	// Regular expression for a telephone number

	private static Pattern phoneNumPtrn = Pattern.compile(

			"^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$");

	public static boolean validatePhoneNumber(String userName) {

		Matcher mtch = phoneNumPtrn.matcher(userName);

		if (mtch.matches()) {

			return true;

		}

		return false;

	}

	// Regular expression for date

	private static Pattern datePtrn = Pattern.compile(

			"([1-9]|[12][0-9]|3[01])/([1-9]|1[012])/((19|20)\\d\\d)");

	public static boolean validateDate(String userName) {

		Matcher mtch = datePtrn.matcher(userName);

		if (mtch.matches()) {

			return true;

		}

		return false;

	}

	/* Where the program starts. The main(). */

	public static void main(String a[]) {

		// Asking for the name

		Scanner scan = new Scanner(System.in);

		String name = new String();

		System.out.println("Please enter a valid name: ");

		name = scan.nextLine();

		if (validateUserName(name) == true) {

			System.out.println("The name is a valid");

			System.out.println();

		} else {

			System.out.println("Sorry the name is not valid");

		}

		// Asking for the email address

		Scanner scanEmail = new Scanner(System.in);

		String email = new String();

		System.out.println("Please enter a valid email: ");

		email = scan.nextLine();

		if (validateEmailAddress(email) == true) {

			System.out.println("The email address is a valid");

			System.out.println();

		} else {

			System.out.println("Sorry the email address is not valid");

			System.out.println();

		}

		// Asking for the phone number

		Scanner scanPhone = new Scanner(System.in);

		String phone = new String();

		System.out.println("Please enter a valid phone number: ");

		phone = scanPhone.nextLine();

		if (validatePhoneNumber(phone) == true) {

			System.out.println("The phone number is a valid");

			System.out.println();

		} else {

			System.out.println("Sorry the phone number is not valid");

			System.out.println();

		}

		// Asking for the date

		Scanner scanDate = new Scanner(System.in);

		String date = new String();

		System.out.println("Please enter a valid date: ");

		date = scanDate.nextLine();

		if (validateDate(date) == true) {

			System.out.println("The date is a valid");

			System.out.println();

		} else {

			System.out.println("Sorry the date is not valid");

			System.out.println();

		}

	}

}
