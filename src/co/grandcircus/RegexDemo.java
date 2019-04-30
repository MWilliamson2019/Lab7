package co.grandcircus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		
		//1st way to use regrex it returns a boolean
		Pattern p = Pattern.compile("abc");
		Matcher m = p.matcher("abcdef");
		boolean test = m.matches();
		System.out.println(test);
		
		//2nd way
		boolean testPhone = Pattern.matches("\\d{3}-\\d{3}-\\d{4}", "313-555-1212");
		System.out.println(testPhone);
		
	}
}