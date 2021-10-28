package util;

import java.util.Scanner;

public class Input {
	private final Scanner keyboard = new Scanner(System.in);

	public String getString() {
		System.out.println("Please enter a sentence: ");
		return keyboard.nextLine();
	}

	public boolean yesNo() {
		System.out.println("Enter yes or no");
		String yesNo = keyboard.nextLine();
		boolean result = yesNo.equalsIgnoreCase("yes");
		System.out.println("Your boolean is " + result);
		return result;
	}

	public int getInt() {
		System.out.println("Enter an integer: ");
		return keyboard.nextInt();
	}

	public int getInt(int min, int max) {
        String prompt = "Enter an integer between " + min + " and " + max;
        System.out.println("Enter an integer between " + min + " and " + max);
        int userInput = keyboard.nextInt();
        while (userInput <= min || userInput >= max) {
            System.out.println("Enter an integer between " + min + " and " + max);
            userInput = keyboard.nextInt();
        }
        return userInput;
    }

	public double getDouble(){
        System.out.println("Enter a number:");
		return keyboard.nextDouble();
    }

	public double getDouble(String prompt){
        System.out.println(prompt);
		return keyboard.nextDouble();
    }
    public double getDouble(double min, double max) {
        String prompt = "Enter an integer between " + min + " and " + max;
        System.out.println("Enter an integer between " + min + " and " + max);
        double userInput = keyboard.nextDouble();
        while (userInput <= min || userInput >= max) {
            System.out.println("Enter andinteger between " + min + " and " + max);
            userInput = keyboard.nextDouble();
        }
        return userInput;
    }


}
