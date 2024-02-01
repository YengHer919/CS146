//Yeng Her
//1.30.24
//Palindrome

//imports
import java.util.Scanner;
import java.util.Collections;

public class Homework1 {
	public static void main(String[] args) {
		//initialize everything
		Scanner input = new Scanner(System.in);
		System.out.print("Type something you want to check for palindrome: ");
		String s = input.nextLine();
		char[] string = s.toCharArray();
		char[] pure = new char[string.length];
		char[] reverse = new char[string.length];
		int k = 0;

		//loop to filter out capitalization and non-alphabetical characters
		for (int i = 0; i < string.length; i++) {
			pure[k] = Character.toLowerCase(string[i]);
			reverse[string.length - 1 - k] = Character.toLowerCase(string[i]);
			k++;

		}

		//combine list of chars
		StringBuilder builder = new StringBuilder();  
		StringBuilder builders = new StringBuilder();

		// iterate charList and append each char to builder one by one  
		for (Character c : pure) {  
			if(Character.isAlphabetic(c)) {
				builder.append(c);  
			}
		}  

		for (Character c : reverse) {  
			if(Character.isAlphabetic(c)) {
				builders.append(c);  
			}  
		}  

		// convert StringBuilder object into string  
		String pureStr = builder.toString();  
		String pureRev = builders.toString();

		if (pureStr.equals(pureRev)) {
			System.out.println(s + " is a palindrome!");
		}else {
			System.out.println(s + " is not a palindrome!");
		}

	}
}
