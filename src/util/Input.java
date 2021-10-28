package util;
import java.util.Scanner;

public class Input {
	private Scanner keyboard;

	public Input() {
		this.keyboard = new Scanner(System.in);
	}
	public String getString(String input){
		System.out.println("Please enter a sentence:");
		return keyboard.nextLine();
	}

	public boolean yesNo() {
		System.out.println("Enter yes or no");
		String yesNo = keyboard.nextLine();
		boolean result = yesNo.equalsIgnoreCase("yes");
		System.out.println("Your boolean is " + result);
		return result;
	}

































}
