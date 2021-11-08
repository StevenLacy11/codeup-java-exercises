package util;

import java.util.*;
import java.util.Scanner;

public class Input {
	private Scanner keyboard;

	// constructor
	public Input() {
		this.keyboard = new Scanner(System.in);
	}

	public String getString() {
		return this.keyboard.nextLine();
	}


	// The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
	public boolean yesNo() {
		String userInput = this.keyboard.next();
		return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
	}


	public int getInt(){
		try {
			return Integer.valueOf(getString());
		}
		catch (NumberFormatException e) {
			System.out.println("RETRY! enter a whole number this time.");
			return getInt();
		}

	}

	// getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//	public int getInt(int min, int max) {
//		int userInt;
//		do {
//			System.out.printf("Please enter a whole number between %d and %d: %n", min, max);
//			userInt = this.keyboard.nextInt();
//		} while(userInt > max || userInt < min);
//		return userInt;
//	}

	public double getDouble(){
		try {
			return Double.valueOf(getString());
		}
		catch (Exception e) {
			System.out.println("RETRY! enter a mixed number this time.");
			e.printStackTrace(System.out);
			return getDouble();
		}

	}
}