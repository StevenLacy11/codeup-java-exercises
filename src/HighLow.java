import java.util.Random;

import java.util.Scanner;

public class HighLow {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);

		int number = random.nextInt(100) + 1;
		int guess = -1;
		int count = 0;

		while (guess != number) {
			count = count + 1;

			System.out.print("Enter a number between 1 and 100: ");
			guess = keyboard.nextInt();

			if (guess < number) {
				System.out.println("HIGHER");
			}
			else if (guess > number) {
				System.out.println("LOWER");
			}
			else {
				System.out.println("GOOD GUESS!\nCorrect, the number was " + number);
			}
		}
		System.out.println("It only took you " + count + " trys.");
	}
}
