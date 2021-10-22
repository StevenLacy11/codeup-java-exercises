import java.util.Scanner;


public class ConsoleExercises {
	public static void main(String[] args) {


		// declare variables to be used
		String word1, word2, word3, sentence;
		double pi = 3.14159, number1, number2, number3, perimeter, area, volume;

		// instantiate an object from the
		// Scanner class to enable reading
		// in from the keyboard

		Scanner keyboard = new Scanner(System.in);

		// prompt the user to enter the first number/ word,
		// then read it in; do the same for the
		// second number/ word
		System.out.format("The value of pi is approximately %.2f%n", pi);

		System.out.println("Enter your first word: ");
		word1 = keyboard.nextLine();
		System.out.println("You entered: " + word1);

		System.out.println("Enter your second word: ");
		word2 = keyboard.nextLine();
		System.out.println("You entered: " + word2);

		System.out.println("Enter your third word: ");
		word3 = keyboard.nextLine();
		System.out.println("You entered: " + word3);

		System.out.println("Enter a sentence: ");
		sentence = keyboard.nextLine();
		System.out.println("You entered: " + sentence);

		System.out.println("Enter the length: ");
		number1 = keyboard.nextDouble();

		System.out.println("Enter the width: ");
		number2 = keyboard.nextDouble();

		System.out.println("Enter the height: ");
		number3 = keyboard.nextDouble();

		perimeter = number1*2 + number2*2;

		System.out.format("\nThe perimeter of the room is \n%.2f ft", perimeter);

		area = number1 * number2;

		System.out.format("\nThe area of the room is \n%.2f square feet", area);

		volume = area * number3;

		System.out.format("\nThe volume of the room is \n%.2f square feet", volume);




		System.out.println("\nThis program was written by Steven Lacy.");
		System.out.println("End of program.");

	}
}
